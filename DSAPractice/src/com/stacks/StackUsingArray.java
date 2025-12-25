package com.stacks;


class StackImpl {
    int top = -1;
    int[] arr;
    int size;

    public StackImpl(int size) {
        arr = new int[size];
        this.size = size;
    }

    public void push(int x) {
        if (top+1 >= size) {
            System.out.println("STACK is FULL");
            return;
        }
        System.out.println("PUSHING ELEMENT : " + x + " AND SIZE IS : " + size());
        top = top + 1;
        arr[top] = x;

    }

    public int pop() {
        if (top == -1) {
            System.out.println("STACK is EMPTY");
            return -1;
        }
        int x = arr[top];
        top = top - 1;
        return x;
    }

    public int size() {
        return top + 1;
    }

    public int top() {
        if (top == -1) {
            System.out.println("STACK IS EMPTY");
            return top;
        }
        return arr[top];
    }
}


public class StackUsingArray {


    public static void main(String[] args) {
        StackImpl stack = new StackImpl(10);
        int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        System.out.println("STACK SIZE IS : " + stack.size());
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }

        System.out.println("Size is : " + stack.size());
        System.out.println("Popping is : " + stack.pop());
        System.out.println("Size is : " + stack.size());
        System.out.println("Popping is : " + stack.pop());
        System.out.println("Size is : " + stack.size());
        System.out.println("Popping is : " + stack.pop());
        System.out.println("Size is : " + stack.size());
        System.out.println("Popping is : " + stack.pop());
        System.out.println("Size is : " + stack.size());
        System.out.println("Popping is : " + stack.pop());
        System.out.println("Size is : " + stack.size());
        System.out.println("Popping is : " + stack.pop());
        System.out.println("Size is : " + stack.size());

        System.out.println("Popping is : " + stack.pop());
        System.out.println("Size is : " + stack.size());
        System.out.println("Popping is : " + stack.pop());
        System.out.println("Size is : " + stack.size());
        System.out.println("Popping is : " + stack.pop());
        System.out.println("Size is : " + stack.size());
        System.out.println("Popping is : " + stack.pop());
        System.out.println("Size is : " + stack.size());
        System.out.println("Popping is : " + stack.pop());
        System.out.println("Size is : " + stack.size());
        System.out.println("Topping is : " + stack.top());


    }
}
