package com.ThreadsConcepts;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledTreadPoolClass {
    public static void main(String[] args){
        try(ScheduledExecutorService executorService = Executors.newScheduledThreadPool(5)){

            for(int i =0;i<250;i++){
                executorService.schedule(()->{
                    System.out.println(Thread.currentThread().getName());
                },1000, TimeUnit.MILLISECONDS);
            }
        }
    }
}
