package com.stacks;

class QueueImpl {
    int currentsize = 0;
    int start;
    int end;
    int[] arr;
    int size;

    QueueImpl(int size) {
        this.size = size;
        this.arr = new int[size];
        start = -1;
        end = -1;
    }

    public void push(int x) {
        if (currentsize >= size) {
            System.out.println("QUEUE is FULL");
            return;
        }
        if (currentsize == 0) {
            start++;
            end++;
            System.out.println("Pusing element into QUEUE " + x);
            arr[end] = x;
            currentsize++;
        } else {
            end = (end + 1) % size;
            System.out.println("Pusing element into QUEUE " + x);
            arr[end] = x;
            currentsize++;
        }

    }

    public int pop() {
        int x;
        if (currentsize == 0) {
            System.out.println("QUEUE IS EMPTY");
            return -1;
        }
        if (currentsize == 1) {
            x = arr[start];
            start = -1;
            end = -1;
            currentsize = 0;
        } else {
            x = arr[start];
            System.out.println("Start is " + start + " element is : " + x);
            start = (start + 1) % size;
            currentsize--;
        }
        return x;
    }

    public int peek() {
        if(currentsize == -1){
            System.out.println("STACK IS MEPTY");
            return-1;
        }
            return arr[start];

    }

    public int size() {
        return currentsize;
    }

}

public class QueueUsingArray {

    public static void main(String[] args) {
        QueueImpl queue = new QueueImpl(10);
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < arr.length; i++) {
            queue.push(arr[i]);
        }
        System.out.println(queue.pop());
        System.out.println("SIZE IS : "+ queue.size());
        System.out.println(queue.pop());
        System.out.println("SIZE IS : "+ queue.size());
        System.out.println(queue.pop());
        System.out.println("SIZE IS : "+ queue.size());
        System.out.println(queue.pop());
        System.out.println("SIZE IS : "+ queue.size());
        System.out.println(queue.pop());
        System.out.println("PEEK IS :"+queue.peek());
        System.out.println("SIZE IS : "+ queue.size());
        System.out.println(queue.pop());
        System.out.println("SIZE IS : "+ queue.size());
        System.out.println(queue.pop());
        System.out.println("SIZE IS : "+ queue.size());
        System.out.println(queue.pop());
        System.out.println("SIZE IS : "+ queue.size());
        System.out.println(queue.pop());
        System.out.println("SIZE IS : "+ queue.size());
        System.out.println(queue.pop());
        System.out.println("SIZE IS : "+ queue.size());
        System.out.println(queue.pop());
        System.out.println("SIZE IS : "+ queue.size());
        System.out.println(queue.pop());
        System.out.println("SIZE IS : "+ queue.size());
        System.out.println(queue.pop());
        System.out.println("SIZE IS : "+ queue.size());
    }
}
