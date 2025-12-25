package com.test;

public class ThreadImpl {
    private static final Object lock = new Object();
    private static int i;

    static void increment() throws InterruptedException {
        synchronized (lock) {

            if (Thread.holdsLock(Thread.currentThread())) {

                lock.wait();
            } else {
                System.out.println("Incrementing i : " + i + " by thread : " + Thread.currentThread().getName());
                i++;
                lock.notify();
            }

        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            try {
                for (int x = 0; x < 10; x++)
                    increment();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                for (int x = 0; x < 10; x++)
                    increment();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t3 = new Thread(() -> {
            try {
                for (int x = 0; x < 10; x++)
                    increment();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();
        t2.start();
        t3.start();

        System.out.println("Main Thread");
    }
}
