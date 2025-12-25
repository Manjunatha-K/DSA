package com.stacknew;

class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class StackLL {
    int size;
    int currentSize = 0;
    Node top;

    StackLL(int size) {
        this.size = size;
    }

    public void push(int x) {
        if (currentSize == 0) {
            top = new Node(x);
            System.out.println("Inserting element : "+ x);
            currentSize++;
            return;
        } else if (currentSize >= size) {
            System.out.println("Stack is full");
            return;
        } else {
            Node temp = new Node(x);
            temp.next = top;
            top = temp;
            System.out.println("Inserting element : "+ x);
            currentSize++;
        }
    }

    public int pop() {
        if (currentSize == 0) {
            System.out.println("STACK IS EMPTY");
            return -1;
        } else {
            int x = top.data;
            top = top.next;
            currentSize--;
            return x;
        }
    }

    public int top() {
        if (currentSize == 0) {
            System.out.println("STACK IS EMPTY");
            return -1;
        } else {
            int x = top.data;
            return x;
        }
    }

    public int size() {
        return currentSize;
    }

}


public class StackUsingLL {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        StackLL st = new StackLL(9);
        for (int i = 0; i < arr.length; i++) {
            st.push(arr[i]);
        }
        System.out.println("SIZE IS : "+ st.size());
        System.out.println("Pop : "+st.pop());
        System.out.println("SIZE IS : "+ st.size());
        System.out.println("Pop : "+st.pop());
        System.out.println("SIZE IS : "+ st.size());
        System.out.println("Pop : "+st.pop());
        System.out.println("Pop : "+st.pop());
        System.out.println("Pop : "+st.pop());
        System.out.println("Pop : "+st.pop());
        System.out.println("Top : "+st.top());
        System.out.println("Pop : "+st.pop());
        System.out.println("Pop : "+st.pop());
        System.out.println("Pop : "+st.pop());

        System.out.println("SIZE IS : "+ st.size());
        System.out.println("top : "+st.top());
        System.out.println("SIZE IS : "+ st.size());
    }
}
