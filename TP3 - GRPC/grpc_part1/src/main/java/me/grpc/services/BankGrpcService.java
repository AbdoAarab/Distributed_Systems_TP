package me.grpc.services;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import me.grpc.stubs.BankServiceGrpc;
import me.grpc.stubs.Bank;

import java.util.*;


public class BankGrpcService extends BankServiceGrpc.BankServiceImplBase  {
    private List<StreamObserver<Bank.AccountTransaction>> globalResponseObservers=new ArrayList<>();

    @Override
    public void convert(Bank.ConvertCurrencyRequest request, StreamObserver<Bank.ConvertCurrencyResponse> responseObserver) {
        double amount = request.getAmount();
        String currencyFrom = request.getCurrencyFrom();
        String currencyTo = request.getCurrencyTo();
        double result = 0;
        Bank.ConvertCurrencyResponse response = Bank.ConvertCurrencyResponse.newBuilder()
                .setCurrencyFrom(currencyFrom)
                .setCurrencyTo(currencyTo)
                .setAmount(amount)
                .setResult(amount*0.11)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getAccount(Bank.GetAccountRequest request, StreamObserver<Bank.GetAccountResponse> responseObserver) {
        String accountId = request.getId();
        Bank.Account account = Bank.Account.newBuilder()
                .setAccountId(accountId)
                .setBalance(Math.random()*1000)
                .setCreatedAt(System.currentTimeMillis())
                .setCurrency("MAD")
                .setType(Bank.AccountType.CURRENT_ACCOUNT)
                .setStatus(Bank.AccountStatus.ACCOUNT_STATUS_ACTIVATED)
                .build();
        Bank.GetAccountResponse response = Bank.GetAccountResponse.newBuilder()
                .setAccount(account)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getListAccount(Bank.GetListAccountsRequest request, StreamObserver<Bank.GetListAccountsResponse> responseObserver) {
        Bank.GetListAccountsResponse.Builder listAccountsBuilder = Bank.GetListAccountsResponse.newBuilder();
        for (int i = 0; i < 5; i++) {
            Bank.Account account= Bank.Account.newBuilder()
                    .setAccountId(UUID.randomUUID().toString())
                    .setBalance(Math.random()*90000)
                    .setCreatedAt(System.currentTimeMillis())
                    .setCurrency("MAD")
                    .setType(Bank.AccountType.CURRENT_ACCOUNT)
                    .setStatus(Bank.AccountStatus.ACCOUNT_STATUS_ACTIVATED)
                    .build();
            listAccountsBuilder.addAccounts(account);
        }
        responseObserver.onNext(listAccountsBuilder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void getStreamOfAccountTransactions(Bank.GetStreamOfAccountTransactionRequest request, StreamObserver<Bank.AccountTransaction> responseObserver) {
        this.globalResponseObservers.add(responseObserver);
        Timer timer=new Timer("Transactions Timer");


        timer.schedule(new TimerTask() {
            private int counter=0;
            @Override
            public void run() {
                Bank.AccountTransaction accountTransaction=Bank.AccountTransaction.newBuilder()
                        .setAccountId(request.getAccountId())
                        .setAmount(1000+Math.random()*9000)
                        .setTransactionDate(System.currentTimeMillis())
                        .setType(Math.random()>0.5?Bank.TransactionType.CREDIT: Bank.TransactionType.DEBIT)
                        .build();
                responseObserver.onNext(accountTransaction);
                ++counter;
                if(counter>20) {
                    responseObserver.onCompleted();
                    timer.cancel();
                }
            }
        }, 0, 1000);
 }

    @Override
    public StreamObserver<Bank.AccountTransaction> submitStreamOfTransaction(StreamObserver<Bank.PerformStreamOfTransactionsResponse> responseObserver) {
        List<Bank.AccountTransaction> performedTransactions=new ArrayList<>();
        Bank.PerformStreamOfTransactionsResponse response=Bank.PerformStreamOfTransactionsResponse.getDefaultInstance();
        return new StreamObserver<Bank.AccountTransaction>() {
            @Override
            public void onNext(Bank.AccountTransaction accountTransaction) {
                Bank.AccountTransaction performedTransaction;
                if(accountTransaction.getAmount()>100){
                    performedTransaction=Bank.AccountTransaction.newBuilder(accountTransaction)
                            .setStatus(Bank.TransactionStatus.EXECUTED).build();
                    performedTransactions.add(performedTransaction);
                }
            }
            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
            }
            @Override
            public void onCompleted() {
                long numberOfPerformedTransactions=0;
                double totalAmountOfPerformedTransactions= 0;
                double totalAmountOfPerformedDebitTransactions=0;
                double totalAmountOfPerformedCreditTransactions=0;
                for (Bank.AccountTransaction tx:performedTransactions){
                    totalAmountOfPerformedTransactions+=tx.getAmount();
                    if(tx.getType().equals(Bank.TransactionType.CREDIT)){
                        totalAmountOfPerformedCreditTransactions+=tx.getAmount();
                    } else {
                        totalAmountOfPerformedDebitTransactions+=tx.getAmount();
                    }
                }
                numberOfPerformedTransactions=performedTransactions.size();
                Bank.PerformStreamOfTransactionsResponse performStreamOfTransactionsResponse =
                        Bank.PerformStreamOfTransactionsResponse.newBuilder()
                                .setNumberOfPerformedTransactions(numberOfPerformedTransactions)
                                .setTotalAmountOfPerformedCreditTransactions(totalAmountOfPerformedCreditTransactions)
                                .setTotalAmountOfPerformedDebitTransactions(totalAmountOfPerformedDebitTransactions)
                                .setTotalAmountOfPerformedTransactions(totalAmountOfPerformedTransactions)
                                .build();
                responseObserver.onNext(performStreamOfTransactionsResponse);
                responseObserver.onCompleted();
            }
    };
    }

    @Override
    public StreamObserver<Bank.AccountTransaction> executeStreamOfTransaction(StreamObserver<Bank.AccountTransaction> responseObserver) {
        return new StreamObserver<Bank.AccountTransaction>() {
            @Override
            public void onNext(Bank.AccountTransaction accountTransaction) {
                if(accountTransaction.getAmount()>100){
                    Bank.AccountTransaction performedTransaction = Bank.AccountTransaction.newBuilder(accountTransaction)
                            .setStatus(Bank.TransactionStatus.EXECUTED)
                            .build();
                    responseObserver.onNext(performedTransaction);
                } else throw new RuntimeException("The transaction "+accountTransaction.getTransactionId()+" is rejected");
            }
            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
            }
            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public void submitTransaction(Bank.AccountTransaction request, StreamObserver<Empty> responseObserver) {
        this.globalResponseObservers.forEach(obs->{
            obs.onNext(request);
        });
        responseObserver.onCompleted();
    }
}
