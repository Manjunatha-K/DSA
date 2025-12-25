package com.stacks;

import java.util.Stack;

class QueueI{
    Stack st1 = new Stack();
    Stack st2 = new Stack();

    public void push(int x){
      st1.push(x);
    }
    public int pop(){
        if(st1.isEmpty() && st2.isEmpty())
            return -1;
        if(!st2.isEmpty()){
           return (Integer) st2.pop();
        }else{
            while(!st1.isEmpty()){
                st2.push(st1.pop());
            }
          return (Integer) st2.pop();
        }

    }
    public int top(){
        if(st1.isEmpty() && st2.isEmpty())
            return -1;
        if(!st2.isEmpty()){
            return (int) st2.peek();
        }else{
            while(!st1.isEmpty())
            {
                st2.push(st1.pop());
            }
            return (int) st2.peek();
        }
    }
    public  int size(){
        return st1.size()+ st2.size();
    }
}

public class QueueUsingStack {

    public static void main(String[] args){
        QueueI queue = new QueueI();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        queue.push(6);
        queue.push(7);
        System.out.println("Topp : "+queue.top());
        System.out.println("Popping : "+ queue.pop());
        System.out.println("Popping : "+ queue.pop());
        System.out.println("Popping : "+ queue.pop());
        System.out.println("size is : "+queue.size());
        System.out.println("Popping : "+ queue.pop());
        System.out.println("Popping : "+ queue.pop());
        System.out.println("Popping : "+ queue.pop());
        System.out.println("Popping : "+ queue.pop());
        System.out.println("Popping : "+ queue.pop());
        System.out.println("Popping : "+ queue.pop());
        System.out.println("size is : "+queue.size());
    }
}
