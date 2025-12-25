package com.ThreadsConcepts;

import java.util.ArrayList;
import java.util.List;

public class ProducerAndConsumer {
    private static int size = 10;
    private static List<Integer> queue = new ArrayList<>();
    private static int counter = 0;
    private static Object lock = new Object();

    private static void producer() throws InterruptedException {
        synchronized (lock) {
            while (true) {
                if (queue.size() < size) {
                    System.out.println("Adding value to queue : "+ counter);
                    queue.add(counter);
                    counter++;
                    lock.notify();
                } else {
                    System.out.println("Queue is full, moving to consumer");
                    lock.wait();
                }
            }
        }
    }

    private static void consumer() throws InterruptedException {
        synchronized (lock) {
            while (true) {
                if (queue.isEmpty()) {
                    System.out.println("Queue is empty, moving to producer");
                    lock.wait();
                } else {
                    System.out.println("removing from queue :"+ counter);
                    queue.remove(--counter);
                    lock.notify();
                    //counter--;
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            try {
                producer();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                consumer();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();
        t2.start();
    }


}
