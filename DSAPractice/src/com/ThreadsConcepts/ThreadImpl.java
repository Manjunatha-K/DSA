package com.ThreadsConcepts;

public class ThreadImpl {
    public static  void main(String[] args) throws InterruptedException {
        Thread t1 =new Thread( ()->{
            for(int i =0;i<10;i++){
                try {
                    Thread.sleep(500);
                    System.out.println("Thread is being executed and the thread name is : "+Thread.currentThread().getName()+" - "+i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread t2 = new Thread(()->{
            for(int i =0;i<10;i++){
                try {
                    Thread.sleep(500);
                    System.out.println("Thread is being executed and the thread name is : "+Thread.currentThread().getName()+" - "+i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.setName("zero-thread");
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(Thread.currentThread().getName());
    }
}
