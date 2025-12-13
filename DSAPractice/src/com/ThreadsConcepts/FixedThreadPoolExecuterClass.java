package com.ThreadsConcepts;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolExecuterClass {
    public static void main(String[] args) {
        try (ExecutorService executer = Executors.newFixedThreadPool(10)) {
            for (int i = 0; i < 250; i++) {
                executer.execute(() -> {
                    System.out.println("The thread is : " + Thread.currentThread().getName());
                });
            }
        }

    }
}

class CustomFixedThread implements Runnable {

    @Override
    public void run() {

    }
}
