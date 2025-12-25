package com.stacknew;


class Stack {
    int[] stack;
    int size;
    int currentSize = 0;

    Stack(int size) {
        this.stack = new int[size];
        this.size = size;
    }

    public void push(int x) {
        if (currentSize < size) {

            System.out.println("Insertin element into stack : " + x);
            stack[currentSize] = x;
            currentSize++;
            return;
        } else {
            System.out.println("STACK IS FULL");
            return;
        }
    }

    public int pop() {
        if (currentSize == 0) {
            System.out.println("STACK IS EMPTY");
            return -1;
        } else {
            currentSize--;
            int x = stack[currentSize];
            return x;
        }
    }

    public int top() {
        if (currentSize == 0) {
            System.out.println("STACK IS EMPTY");
            return -1;
        } else {
            int x = stack[currentSize];

            return x;
        }
    }

    public int size() {
        return currentSize;
    }

}

public class StackUsingArray {


    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Stack st = new Stack(9);
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
        System.out.println("Pop : "+st.pop());
        System.out.println("Pop : "+st.pop());
        System.out.println("Pop : "+st.pop());
        System.out.println("Pop : "+st.pop());

        System.out.println("SIZE IS : "+ st.size());
        System.out.println("top : "+st.top());
        System.out.println("SIZE IS : "+ st.size());
    }
}
