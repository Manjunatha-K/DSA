package com.ThreadsConcepts;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolExecuterClass {

    public static void main(String[] args){
        try(ExecutorService executorService = Executors.newCachedThreadPool()){
            for(int i =0;i<150;i++){
                executorService.execute(()->{
                    try {
                        Thread.sleep(100);
                        System.out.println("The Thread name is "+Thread.currentThread().getName()  );
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                });
            }
            executorService.shutdown();
        }
    }
}
