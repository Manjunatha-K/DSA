package com.ThreadsConcepts;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

class callableClass implements Callable<Integer> {
    private static int sum = 0;

    @Override
    public Integer call() throws Exception {
        for (int i = 0; i < 10; i++) {
            sum += i;
            Thread.sleep(100);
        }
        return sum;
    }
}

public class CallableAndFuture {
    public static void main(String[] args) {

        List<Future<Integer>> results = new ArrayList<>();

        try (ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors())) {

            Callable<Integer> task = () -> {
                int sum = 0;
                for (int i = 0; i < 100; i++) {
                    System.out.println("Thread name : " + Thread.currentThread().getName());
                    sum += i;
                    //Thread.sleep(1000);
                }
                return sum;
            };
            Future<Integer> intre = null;

            for (int i = 0; i < 10; i++) {
                intre = executorService.submit(task);
                results.add(intre);
            }
           // results.add(intre);
            System.out.println("Execution is in main thread");
            System.out.println(LocalDateTime.now());
            for (Future future : results) {
                System.out.println("result is : "+ future.get() +" Thread is : "+ Thread.currentThread().getName());
            }
            System.out.println("After calling get method : ");
            System.out.println(LocalDateTime.now());
        } catch (RuntimeException | InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
