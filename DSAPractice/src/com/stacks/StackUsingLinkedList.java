package com.stacks;

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

class StackLLImpl {
    Node top;
    int currentsize = 0;
    int size = 10;

    StackLLImpl() {

    }

    public void push(int x) {
        if(currentsize >= size){
            System.out.println("STACK is FULL");
            return;
        }
        Node temp = new Node(x);
        System.out.println("Pushing element into stack : " + x);
        temp.next = top;
        top = temp;
        currentsize++;
    }

    public Node pop() {
        if(currentsize ==0){
            System.out.println("STACK is EMPTY");
            return new Node(-1);
        }

        Node temp = top;
        System.out.println("popping elemenet "+ temp.data);
        top = top.next;
        currentsize--;
        return temp;
    }

    public Node top() {
        if(currentsize ==0){
            System.out.println("STACK is EMPTY");
            return new Node(-1);
        }
        Node temp = top;
        System.out.println("popping elemenet "+ temp.data);
        return temp;
    }

    public int size() {
        return currentsize;
    }
}

public class StackUsingLinkedList {

    public static void main(String[] args) {
        StackLLImpl stackLL = new StackLLImpl();
        for (int i = 0; i < 13; i++) {
            stackLL.push(i);
        }
        stackLL.pop();
        stackLL.pop();
        System.out.println("SIZE IS :"+ stackLL.size());
        stackLL.pop();
        stackLL.pop();
        stackLL.pop();
        System.out.println("SIZE IS :"+ stackLL.size());
        stackLL.pop();
        stackLL.pop();
        stackLL.pop();
        System.out.println("SIZE IS :"+ stackLL.size());
        stackLL.pop();
        stackLL.pop();
        stackLL.pop();
        stackLL.pop();
        stackLL.pop();
        System.out.println("SIZE IS :"+ stackLL.size());
        stackLL.pop();
    }
}
