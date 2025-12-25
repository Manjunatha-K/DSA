package com.test;

/*
Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
Return the linked list sorted as well.

Ex:
Input: head = [1,1,2] Output: [1,2]
Input: head = [1,1,2,3,3] Output: [1,2,3]
 */

class Node{
    int data;
    Node next;
    Node(int data, Node next){
       this.data = data;
       this.next = next;
    }
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
   public static  void main(String[] args){
       Node head = new Node(1);
       Node t1 = new Node(1);
       Node t2 = new Node(2);
       Node t3 = new Node(3);
       Node t4 = new Node(3);
       head.next = t1;
       t1.next = t2;
       t2.next = t3;
       t3.next = t4;
       removeDuplicates(head);
   }

    private static void removeDuplicates(Node head) {
       Node temp = head;
       Node temp2;
       while(temp != null && temp.next != null){
           if(temp.data == temp.next.data){
               temp.next = temp.next.next;
           }
           temp = temp.next;
       }
        System.out.println("Traversal");
       temp2 = head;
       while(temp2 != null){
           System.out.println(temp2.data);
           temp2 = temp2.next;
       }

    }

}
public class Tasks {
}
