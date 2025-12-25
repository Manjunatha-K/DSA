package com.stacks;

import java.util.Queue;
import java.util.Stack;
/*
Stack is a LIFO-Last in first out.
{1,2,3,4,5} - in stack, the retriving order is 5,4,3,2,1
 */
class StackI{
    QueueLL q = new QueueLL(10);

    public void push(int x){
        int s = q.size();
        q.push(x);
        for(int i =1;i<=s;i++){
            q.push(q.pop());
        }
    }
    public int pop(){
        return (Integer) q.pop();
    }
    public int top(){
       return (Integer) q.top();
    }
    public int size(){
      return  q.size();
    }
}

public class StackUsingQueue {

    public static void main(String[] args) {
        StackI obj = new StackI();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.push(6);
        System.out.println("Size is "+obj.size());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println("Size is "+obj.size());
        System.out.println(obj.top());
        System.out.println("Size is "+obj.size());
    }
}
