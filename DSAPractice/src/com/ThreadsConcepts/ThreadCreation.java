package com.ThreadsConcepts;

public class ThreadCreation extends Thread{
    @Override
    public void run() {
        for(int i =0;i<15;i++){
            try {
                Thread.sleep(1000);
                System.out.println("Thread is being executed and the thread name is : "+Thread.currentThread().getName()+" - "+i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args){
        ThreadCreation t1 = new ThreadCreation();
        t1.setName("first-thread ");
        t1.start();
    }
}
