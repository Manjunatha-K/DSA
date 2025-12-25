package com.LinkedList;

class Node3 {
    int data;
    Node3 next;

    Node3() {

    }

    Node3(int data) {
        this.data = data;
    }

    Node3(int data, Node3 next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return data+"->"+next;
    }
}

public class LinkedListImpl {
    public static void main(String[] args){
        Node3 head = new Node3(1);
        Node3 first = new Node3(2);
        Node3 second = new Node3(3);
        Node3 three = new Node3(4);
        head.next = first;
        first.next = second;
        second.next = three;
        System.out.println(head);
    }
}
