package com.ThreadsConcepts;

public class WaitAndNotify {
    private static Object lock = new Object();
    public static  void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
           synchronized (lock){
               System.out.println("I am in Thread : "+Thread.currentThread().getName());
               System.out.println("Before calling wait method ");
               try {
                   lock.wait();
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
               System.out.println("Back to Thread : "+Thread.currentThread().getName());
           }
        });

        Thread t2 = new Thread(()->{
            synchronized (lock){
                System.out.println("I am in Thread : "+Thread.currentThread().getName());
                System.out.println("Before calling notify");
                lock.notify();
                System.out.println("After calling notify in Thread : "+Thread.currentThread().getName());
            }
        });
        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Inside main method");
    }
}
