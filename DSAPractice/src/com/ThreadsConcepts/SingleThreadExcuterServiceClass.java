package com.ThreadsConcepts;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class CustomThread implements  Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Method is being executed by thread : "+Thread.currentThread().getName());

    }
}
public class SingleThreadExcuterServiceClass {
    public static void main(String[] args){
        try(ExecutorService singleThread = Executors.newSingleThreadExecutor()){
            for(int i =0;i<250;i++){
                singleThread.execute(new CustomThread());
            }
        }
    }
}
