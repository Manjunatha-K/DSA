package com.logic.DSA.LinkedList;

import java.net.Inet4Address;

public class LinkedListImpl {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node temp1 = new Node(2, null);
        Node temp2 = new Node(3);
        Node temp3 = new Node(4);
        Node temp4 = new Node(5);
        Node temp5 = new Node(6, null);
        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = temp4;
        temp4.next = temp5;

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}


