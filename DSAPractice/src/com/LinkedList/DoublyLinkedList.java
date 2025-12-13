package com.LinkedList;

import javax.crypto.spec.PSource;

class DNode {
    DNode previous;
    int data;
    DNode next;

    public DNode(DNode previous, int data, DNode next) {
        this.previous = previous;
        this.data = data;
        this.next = next;
    }

    public DNode(int data) {
        this.data = data;
        this.previous = null;
        this.next = null;
    }

    public DNode() {
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        DNode head = convertArrayTo2DList(arr);
       // deleteHead(head);
       // deleteTail(head);
       // deleteKthElement(head, 1);
        reverseList(head);
    }

    private static void reverseList(DNode head) {
        DNode neHead = null;
        if(head == null){
            System.out.println("EMPTY LINKED LIST");
            return;
        }else if(head.next == null){
            System.out.println("SINGLE ELEMENT IN A LIST");
            System.out.println("AFTER REVERSING"+head.data);
            return;
        }else{
            DNode next = null;
            DNode previous = null;
            DNode currentNode = head;
            while(currentNode != null){
                DNode temp = currentNode.next;
                currentNode.next = currentNode.previous;
                currentNode.previous = temp;
                neHead = currentNode;
                currentNode = temp;
            }
        }
        System.out.println("AFTER REVERSING : ");
        DNode temp2 = neHead;
        while (temp2 != null) {
            System.out.println(temp2.data);
            temp2 = temp2.next;
        }
    }

    private static void deleteKthElement(DNode head, int i) {

        if (head == null) {
            System.out.println("Head is null");
            return;
        }
        int counter = 0;
        DNode temp = head;
        while (temp != null) {
            counter++;
            if (counter == i) {
                break;
            }
            temp = temp.next;

        }
        if (temp == null) {
            System.out.println("HEAD EMPTY");
            return;
        }
        DNode previous = temp.previous;
        DNode next = temp.next;
        if (previous == null && next == null) {
            System.out.println("EMPTY");
            return;
        }
        else if (previous == null) {
            deleteHead(head);
            return;
        }
        else if (next == null) {
            deleteTail(head);
            return;
        }
        else {
            previous.next = next;
            next.previous = previous;
            temp.next = null;
            temp.previous = null;
        }

        System.out.println("Deleted data at kth position : ");
        DNode temp2 = head;
        while (temp2 != null) {
            System.out.println(temp2.data);
            temp2 = temp2.next;
        }
    }

    private static void deleteTail(DNode head) {
        DNode temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next.previous = null;
        System.out.println("Deleted element is : " + temp.next.data);
        temp.next = null;
        DNode temp2 = head;
        while (temp2 != null) {
            System.out.println(temp2.data);
            temp2 = temp2.next;
        }
    }

    private static void deleteHead(DNode head) {
        if (head == null)
            System.out.println("NULL");
        else if (head.next == null) {
            System.out.println(head.data);
            head = null;
        } else {
            head.next.previous = null;
            System.out.println("Deleted element is : " + head.data);
            head = head.next;
        }
        DNode temp2 = head;
        while (temp2 != null) {
            System.out.println(temp2.data);
            temp2 = temp2.next;
        }
    }

    private static DNode convertArrayTo2DList(int[] arr) {
        DNode head = new DNode(arr[0]);
        DNode previousNode = head;
        for (int i = 1; i < arr.length; i++) {
            DNode temp = new DNode(arr[i]);
            previousNode.next = temp;
            temp.previous = previousNode;
            previousNode = temp;
        }
        System.out.println("After traversal ");
        DNode temp2 = head;
        while (temp2 != null) {
            System.out.println(temp2.data);
            temp2 = temp2.next;
        }
        return head;
    }
}
