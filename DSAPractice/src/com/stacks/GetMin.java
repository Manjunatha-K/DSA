package com.stacks;

import java.util.Stack;

class Pair {
    int key;
    int value;

    Pair(int key, int value) {
        this.key = key;
        this.value = value;
    }

    Pair() {

    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

class MinStack {
    Stack<Pair> st = new Stack();


    public void push(int x) {
        int min = Integer.MAX_VALUE;
        if (st.isEmpty()) {
            min = x;
            st.push(new Pair(x, min));
        } else {
            if (min > x) {
                min = x;
                st.push(new Pair(x, min));
            }
        }

    }

    public int pop() {
        if (st.isEmpty())
            return -1;
        else {
            return st.pop().key;
        }

    }

    public int top() {
        if (st.isEmpty())
            return -1;
        else {
            return st.peek().key;
        }
    }

    public int size() {
        return st.size();
    }

    public int minimum() {
        if (st.isEmpty())
            return -1;
        else {
            return st.peek().value;
        }
    }
}

class MinStackOptimal {
    Stack<Integer> st = new Stack();
    int mini;
    public void push(int value) {
        // If stack is empty
        if (st.isEmpty()) {
            // Update the minimum value
            mini = value;

            // Push current value as minimum
            st.push(value);
            return;
        }

        // If the value is greater than the minimum
        if (value > mini) {
            st.push(value);
        } else {
            // Add the modified value to stack
            st.push(2 * value - mini);
            // Update the minimum
            mini = value;
        }
    }

    // Method to pop a value from stack
    public int pop() {
        // Base case
        if (st.isEmpty()) return -1;

        // Get the top
        int x =  st.pop();

        // If the modified value was added to stack
        if (x < mini) {
            // Update the minimum
            int topv = mini;
            mini = 2 * mini - x;
            return topv;
        }else {
            return mini;
        }
    }

    // Method to get the top of stack
    public int top() {
        // Base case
        if (st.isEmpty()) return -1;

        // Get the top
        int x = st.peek();

        // Return top if minimum is less than the top
        if (mini < x) return x;

        // Otherwise return mini
        return mini;
    }

    // Method to get the minimum in stack
    public int getMin() {
        // Return the minimum
        return mini;
    }

}

public class GetMin {
    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(15);
        obj.push(12);
        System.out.println("GETIING MINIMUM " + obj.minimum());
        obj.push(10);
        System.out.println("GETIING MINIMUM " + obj.minimum());
        System.out.println("Pop :" + obj.pop());
        System.out.println("Pop :" + obj.pop());
        System.out.println("GETIING MINIMUM " + obj.minimum());
        System.out.println("Pop :" + obj.pop());

        System.out.println("Top " + obj.top());

        System.out.println("------------OPTIMAL----------");
        MinStackOptimal obj2 = new MinStackOptimal();
        obj2.push(15);
        obj2.push(12);
        System.out.println("GETIING MINIMUM " + obj2.getMin());
        obj2.push(10);
        System.out.println("GETIING MINIMUM " + obj2.getMin());
        System.out.println("Pop :" + obj2.pop());
        System.out.println("Pop :" + obj2.pop());
        System.out.println("GETIING MINIMUM " + obj2.getMin());
        System.out.println("Pop :" + obj2.pop());
        System.out.println("Top " + obj2.top());
    }
}
