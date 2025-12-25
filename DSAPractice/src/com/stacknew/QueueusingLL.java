package com.stacknew;

class NodeQ {
    int data;
    NodeQ next;

    NodeQ(int data, NodeQ next) {
        this.data = data;
        this.next = next;
    }

    NodeQ(int data) {
        this.data = data;
        this.next = null;
    }
}

class QueueLL {
    NodeQ start;
    NodeQ end;
    int currentSize = 0;
    int size;

    QueueLL(int size) {
        this.size = size;
    }

    public void push(int data) {
        if (currentSize == 0) {
            currentSize++;
            System.out.println("INSERTING ELEMENT : "+ data);
            start = new NodeQ(data);
            end = start;
        } else if (currentSize >= size) {
            System.out.println("QUEUE is FULL");
            return;
        } else {
            NodeQ temp = new NodeQ(data);
            System.out.println("INSERTING ELEMENT : "+ data);
            end.next = temp;
            end = temp;
            currentSize++;
        }
    }

    public int pop() {
        int data;
        if(currentSize == 0){
            System.out.println("QUEUE is EMPTY");
            return -1;
        }else {
            data = start.data;
            start = start.next;
            currentSize--;
        }
        return data;
    }

    public int top() {
        int data;
        if(currentSize == 0){
            System.out.println("QUEUE is EMPTY");
            return -1;
        }else {
            data = start.data;
        }
        return data;
    }

    public int size() {
        return currentSize;
    }
}

public class QueueusingLL {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        QueueLL q = new QueueLL(9);
        for (int i = 0; i < arr.length; i++) {
            q.push(arr[i]);
        }
        System.out.println("SIZE IS : " + q.size());
        System.out.println("Pop : " + q.pop());
        System.out.println("SIZE IS : " + q.size());
        System.out.println("Pop : " + q.pop());
        System.out.println("SIZE IS : " + q.size());
        System.out.println("Pop : " + q.pop());
        System.out.println("Pop : " + q.pop());
        System.out.println("Pop : " + q.pop());
        System.out.println("SIZE IS : " + q.size());
        System.out.println("Pop : " + q.pop());
        System.out.println("Top : " + q.top());
        System.out.println("Pop : " + q.pop());
        System.out.println("Pop : " + q.pop());
        System.out.println("Pop : " + q.pop());

        System.out.println("SIZE IS : " + q.size());
        System.out.println("top : " + q.top());
        System.out.println("SIZE IS : " + q.size());
    }
}
