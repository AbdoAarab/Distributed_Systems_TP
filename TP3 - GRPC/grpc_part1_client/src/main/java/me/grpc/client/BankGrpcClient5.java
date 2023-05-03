package me.grpc.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import me.grpc.stubs.BankServiceGrpc;
import me.grpc.stubs.Bank;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class BankGrpcClient5 {
    public static void main(String[] args) throws IOException {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost",5555)
                .usePlaintext()
                .build();
        BankServiceGrpc.BanqueServiceStub asyncStub =  BankServiceGrpc.newStub(managedChannel);
        Bank.ConvertCurrencyRequest request= Bank.ConvertCurrencyRequest.newBuilder()
                .setCurrencyFrom("MAD")
                .setCurrencyTo("EUR")
                .setAmount(12.45)
                .build();

        StreamObserver<Bank.ConvertCurrencyRequest> performStream = asyncStub.fullStream(new StreamObserver<Bank.ConvertCurrencyResponse>() {
            @Override
            public void onNext(Bank.ConvertCurrencyResponse convertCurrencyResponse) {
                System.out.println("=================");
                System.out.println(convertCurrencyResponse);
                System.out.println("=================");
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                System.out.println("END .........");
            }
        });

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            int counter = 0;

            @Override
            public void run() {
                 Bank.ConvertCurrencyRequest currencyRequest = Bank.ConvertCurrencyRequest.newBuilder()
                         .setAmount(Math.random()*7000)
                         .build();
                performStream.onNext(request);
                System.out.println("************ sending request " + counter);
                ++counter;
                if (counter == 10) {
                    performStream.onCompleted();
                    timer.cancel();
                }
            }
        }, 0, 1000);

        performStream.onNext(request);

        System.in.read();

    }
}
