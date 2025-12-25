package com.ThreadsConcepts;

public class ProblemWithSyncronization {
    private  static Integer count1 =0;
    private  static Integer count2 =0;
    private static Object lock1 = new Object();
    private static Object lock2 = new Object();
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
           synchronized (lock1){
               System.out.println("Thread : "+Thread.currentThread().getName()+" started");
               for(int i =0;i<100;i++){
                   try {
                       Thread.sleep(100);
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
                   count1++;
               }
               System.out.println("Thread : "+Thread.currentThread().getName()+" completed");
           }
        });

        Thread t2 = new Thread(()->{
           synchronized (lock2){
               System.out.println("Thread : "+Thread.currentThread().getName()+" started");
               for (int i =0;i<100;i++){
                   try {
                       Thread.sleep(100);
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
                   count2++;
               }
               System.out.println("Thread : "+Thread.currentThread().getName()+" completed");
           }
        });
        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Inside Main thread count is : "+count1 +" and "+count2);
    }
}
