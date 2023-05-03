package me.grpc.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import me.grpc.stubs.BankServiceGrpc;
import me.grpc.stubs.Bank;

public class BankGrpcClient1 {
    public static void main(String[] args) {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost",5555)
                .usePlaintext()
                .build();
        BankServiceGrpc.BanqueServiceBlockingStub blockingStub =  BankServiceGrpc.newBlockingStub(managedChannel);
        Bank.ConvertCurrencyRequest request= Bank.ConvertCurrencyRequest.newBuilder()
                .setCurrencyFrom("MAD")
                .setCurrencyTo("EUR")
                .setAmount(12.45)
                .build();
        Bank.ConvertCurrencyResponse convertCurrencyResponse = blockingStub.convert(request);
        System.out.printf(convertCurrencyResponse.toString());
    }
}
