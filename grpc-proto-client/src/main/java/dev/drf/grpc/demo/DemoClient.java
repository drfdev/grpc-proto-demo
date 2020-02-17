package dev.drf.grpc.demo;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class DemoClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext()
                .build();

        // TODO
    }
}
