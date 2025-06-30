package com.logic.DSA.LinkedList;

public class LinkedListFromArrayList {
    private static void linkedListImpl(int[] arr) {
        Node head = new Node(arr[0]);
        Node tempHead = head;
        for(int i =1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            tempHead.next = temp;
            tempHead = tempHead.next;
        }
        System.out.println("After Implementation");
        while(head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        linkedListImpl(arr);
    }
}
