package com.logic.DSA.DoublyLinkedList;

import com.logic.DSA.DoublyLinkedList.Node;

public class InsertElementInADoublyLinkedList {
    private static Node DoublylinkedListImpl(int[] arr) {
        Node head = new Node(arr[0],null,null);
        Node temp = head;
        for(int i =1;i<arr.length;i++){
            Node newNode = new Node(arr[i]);
            Node previous = temp;
            temp.next = newNode;
            newNode.previous = previous;
            temp = temp.next;
        }
        System.out.println("After Implementation");
        Node temp1 = head;
        while(temp1.previous != null){
            System.out.println(temp1.data);
            temp1 = temp1.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int ele = 24;
        int index = 6;
       Node head = DoublylinkedListImpl(arr);
       Node updatedHead = insertElement(head,ele,index);
        System.out.println("After Insertion");
        Node temp = updatedHead;
        while (temp.next!= null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    private static Node insertElement(Node head, int ele, int index) {
        int len = findLength(head);
        if(index>len){
            System.out.println("Invalid Index!!! Please try again");
            return head;
        }else if(head == null && index ==0){
            head = new Node(ele,null,null);
            return head;
        }else if(head != null && index ==0){
            Node newHead = new Node(ele,null,head);
            return newHead;
        }else{
            int counter =-1;
            Node temp = head;
            Node previous = null;
            while(temp!= null){
                counter++;
                previous = temp;
                if(counter == index-1){
                    break;
                }
                temp = temp.next;
            }
            Node newNode = new Node(ele,previous,temp.next);
            temp.next= newNode;
            return head;
        }
    }

    private static int findLength(Node head) {
        int counter =0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            counter++;
        }
        return counter;
    }
}
