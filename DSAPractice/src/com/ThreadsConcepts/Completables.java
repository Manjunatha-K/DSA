package com.ThreadsConcepts;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Completables {

    public static void main(String[] args) {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
                    System.out.println("Thread is : " + Thread.currentThread().getName());
                }
        );
        future.join();

        try (ExecutorService executorService = Executors.newFixedThreadPool(8)) {
            CompletableFuture<Void> futureCustom = CompletableFuture.runAsync(() -> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread is from : " + Thread.currentThread().getName());
            }, executorService);

            futureCustom.join();
            executorService.shutdown();
        }

        // System.out.println("Main Thread");
    }
}
