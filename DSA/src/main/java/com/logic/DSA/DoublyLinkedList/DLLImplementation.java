package com.logic.DSA.DoublyLinkedList;

import com.logic.DSA.DoublyLinkedList.Node;

public class DLLImplementation {
    public static void main(String[] args) {
        Node head = new Node(1,null,null);
        Node temp1 = new Node(2,head,null);
        Node temp2 = new Node(3,temp1,null);
        Node temp3 = new Node(4,temp2,null);
        Node temp4 = new Node(5,temp3,null);
        Node temp5 = new Node(6,temp4,null);

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
