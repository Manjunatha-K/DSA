package com.logic.DSA.LinkedList;

public class InsertElementInALinkedList {
    private static Node linkedListImpl(int[] arr) {
        Node head = new Node(arr[0]);
        Node tempHead = head;
        for(int i =1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            tempHead.next = temp;
            tempHead = tempHead.next;
        }
        System.out.println("After Implementation");
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int ele = 24;
        int index = 10;
       Node head = linkedListImpl(arr);
       Node updatedHead = insertElement(head,ele,index);
        System.out.println("After Insertion");
        Node temp = updatedHead;
        while (temp!= null){
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
            head = new Node(ele,null);
            return head;
        }else if(head != null && index ==0){
            Node newHead = new Node(ele,head);
            return newHead;
        }else{
            int counter =-1;
            Node temp = head;
            while(temp!= null){
                counter++;
                if(counter == index-1){
                    break;
                }
                temp = temp.next;
            }
            Node newNode = new Node(ele,temp.next);
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
