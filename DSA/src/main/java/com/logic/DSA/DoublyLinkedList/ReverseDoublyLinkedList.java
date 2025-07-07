package com.logic.DSA.DoublyLinkedList;

public class ReverseDoublyLinkedList {

    private static Node reverseDll(Node head) {
        if (head == null || head.next == null) {
            // No change is needed;
            // return the current head
            return head;
        }

        // Initialize a pointer to
        // the previous node
        Node prev = null;

        // Initialize a pointer to
        // the current node
        Node current = head;

        // Traverse the linked list
        while (current != null) {

            // Store a reference to
            // the previous node
            prev = current.previous;

            // Swap the previous and
            // next pointers
            current.previous = current.next;

            // This step reverses the links
            current.next = prev;

            // Move to the next node
            // in the orignal list

            current = current.previous;
        }

        // The final node in the original list
        // becomes the new head after reversal
        return prev.previous;
    }

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
        System.out.println("BEFORE REVERSING");
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        Node reverseHead = reverseDll(head);
        System.out.println("AFTER REVERSING");
        while (reverseHead != null) {
            System.out.println(reverseHead.data);
            reverseHead = reverseHead.next;
        }
    }
}
