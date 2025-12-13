package com.ThreadsConcepts;

public class ThreadRunnable implements Runnable{
    @Override
    public void run() {
        for(int i =0;i<15;i++){
            try {
                Thread.sleep(500);
                System.out.println("Thread is being executed and the thread name is : "+Thread.currentThread().getName()+" - "+i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args){
        ThreadRunnable runnableObj = new ThreadRunnable();
        Thread t1 = new Thread(runnableObj);
        t1.start();
    }
}
