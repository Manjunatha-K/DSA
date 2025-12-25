package com.stacks;

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

    public void push(int x) {
        System.out.println("size is :"+ size);
        if (currentSize >= size) {
            System.out.println("QUEUE IS FULL");
            return;
        }
        if (currentSize == 0) {
            System.out.println("Pushing element into QUEUE");
            NodeQ temp = new NodeQ(x);
            start = temp;
            currentSize++;
            end = temp;
            return;
        }
        NodeQ temp = new NodeQ(x);
        System.out.println("Pushing element into QUEUE : "+ x);
        currentSize++;
        end.next = temp;
        end = temp;
        return;

    }

    public int pop() {
        if (currentSize == 0) {
            System.out.println("QUEUE IS EMPTY");
            return -1;
        }
        if (currentSize == 1) {
            System.out.println("Popping element : " + start.data);
            int data = start.data;
            start = start.next;
            currentSize = 0;
            return data;
        }
        int data = start.data;
        System.out.println("Popping element : " + start.data);
        start = start.next;
        currentSize--;
        return data;

    }

    public int top() {
        if (currentSize == 0) {
            System.out.println("QUEUE is EMPTY");
            return -1;
        }
        int data = start.data;
        return data;

    }

    public int size() {
        return currentSize;
    }
}

public class QueueUsingLinkedList {
    public static void main(String[] args) {
        QueueLL queue = new QueueLL(10);
        for (int i = 0; i < 14; i++) {
            queue.push(i);
        }
        System.out.println("Popping : "+ queue.pop());
        System.out.println("SIZE is : "+ queue.size());
        System.out.println("Popping : "+ queue.pop());
        System.out.println("SIZE is : "+ queue.size());
        System.out.println("Popping : "+ queue.pop());
        System.out.println("Topping : "+ queue.top());
        System.out.println("SIZE is : "+ queue.size());
        System.out.println("Popping : "+ queue.pop());
        System.out.println("SIZE is : "+ queue.size());
        System.out.println("Popping : "+ queue.pop());
        System.out.println("SIZE is : "+ queue.size());
        System.out.println("Popping : "+ queue.pop());
        System.out.println("SIZE is : "+ queue.size());
        System.out.println("Topping : "+ queue.top());
        System.out.println("Popping : "+ queue.pop());
        System.out.println("SIZE is : "+ queue.size());
        System.out.println("Popping : "+ queue.pop());
        System.out.println("SIZE is : "+ queue.size());
        System.out.println("Popping : "+ queue.pop());
        System.out.println("Topping : "+ queue.top());
        System.out.println("SIZE is : "+ queue.size());
        System.out.println("Popping : "+ queue.pop());
        System.out.println("SIZE is : "+ queue.size());
        System.out.println("Topping : "+ queue.top());
        System.out.println("Popping : "+ queue.pop());
        System.out.println("SIZE is : "+ queue.size());
        System.out.println("Popping : "+ queue.pop());
        System.out.println("SIZE is : "+ queue.size());
        System.out.println("Popping : "+ queue.pop());
        System.out.println("SIZE is : "+ queue.size());

    }
}
