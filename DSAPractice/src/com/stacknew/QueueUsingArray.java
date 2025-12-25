package com.stacknew;

class Queue {
    int[] queue;
    int currentSize = 0;
    int start = -1;
    int end = -1;
    int size;

    Queue(int size) {
        this.queue = new int[size];
        this.size = size;
    }

    public void push(int x) {
        if (currentSize==0) {
            end++;
            start++;
            System.out.println("INSERTING ELEMENT INTO QUEUE : "+x);
            queue[end] = x;
            currentSize++;
        } else if (currentSize < size) {
            end = (end+1)%size;
            System.out.println("INSERTING ELEMENT INTO QUEUE : "+x);
            queue[end] = x;
            currentSize++;
        }else{
            System.out.println("QUEUE IS FULL");
        }
    }

    public int pop() {
        if (currentSize==0) {
            System.out.println("STACK IS EMPTY");
            return -1;
        }
          else if(currentSize>0){
            int x = queue[start];
            start = (start + 1) % size;
            currentSize--;
            return x;
        }
        return -1;
    }

    public int top() {
        if (currentSize==0) {
            System.out.println("STACK IS EMPTY");
            return -1;
        }
        else if(currentSize>0){
            int x = queue[start];
            return x;
        }
        return -1;
    }

    public int size() {
        return currentSize;
    }
}


public class QueueUsingArray {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Queue q = new Queue(9);
        for (int i = 0; i < arr.length; i++) {
            q.push(arr[i]);
        }
        System.out.println("SIZE IS : "+ q.size());
        System.out.println("Pop : "+q.pop());
        System.out.println("SIZE IS : "+ q.size());
        System.out.println("Pop : "+q.pop());
        System.out.println("SIZE IS : "+ q.size());
        System.out.println("Pop : "+q.pop());
        System.out.println("Pop : "+q.pop());
        System.out.println("Pop : "+q.pop());
        System.out.println("Pop : "+q.pop());
        System.out.println("Pop : "+q.pop());
        System.out.println("Pop : "+q.pop());
        System.out.println("Pop : "+q.pop());
        System.out.println("Pop : "+q.pop());

        System.out.println("SIZE IS : "+ q.size());
        System.out.println("top : "+q.top());
        System.out.println("SIZE IS : "+ q.size());
    }
}
