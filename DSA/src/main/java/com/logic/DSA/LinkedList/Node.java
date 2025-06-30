package com.logic.DSA.LinkedList;

public class Node {
    Integer data;
    Node next;

    Node() {
    }

    Node(Integer data) {
        this.data = data;
    }

    Node(Integer data, Node next) {
        this.data = data;
        this.next = next;
    }
}
