package com.logic.DSA.DoublyLinkedList;

public class Node {
    Node previous;
    Integer data;
    Node next;

    Node() {
    }

    Node(Integer data) {
        this.data = data;
    }

    Node(Integer data,Node previous, Node next) {
        this.previous = previous;
        this.data = data;
        this.next = next;
    }
}
