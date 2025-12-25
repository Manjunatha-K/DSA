package com.stacknew;

import java.util.Stack;

class QueueSt{

    Stack st1 = new Stack();
    Stack st2 = new Stack();

    public void push(int data){
        System.out.println("insertng element into Queue : "+ data);
        st1.push(data);
    }
    public int pop(){
        if(!st2.isEmpty()){
            return (int) st2.pop();
        }else{
            while(!st1.isEmpty()){
                st2.push(st1.pop());

            }
            return (int )st2.pop();
        }
    }
    public int top(){
        if(!st2.isEmpty()){
            return (int) st2.peek();
        }else{
            while(!st1.isEmpty()){
                st2.push(st1.pop());
            }
        }
        return -1;
    }
    public int size(){
     return    st1.size() + st2.size();
    }
}

public class QueueUsingStack {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        QueueSt q = new QueueSt();
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
