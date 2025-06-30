package com.logic.DSA.LinkedList;

public class SearchingInALinkedList {

    private static Node linkedListImpl(int[] arr) {
        Node head = new Node(arr[0]);
        Node tempHead = head;
        for(int i =1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            tempHead.next = temp;
            tempHead = tempHead.next;
        }
        System.out.println("After Implementation");
        Node traversalNode = head;
        while(traversalNode != null){
            System.out.println(traversalNode.data);
            traversalNode = traversalNode.next;
        }
        return  head;
    }
    private static void searchList(Node head, int searchEle) {
        Node temp = head;
        while(temp != null){
            if(temp.data == searchEle){
                System.out.println("Element is present in a List");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Element is not present");
        return;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
       Node head = linkedListImpl(arr);
        int searchEle = 11;
        searchList(head,searchEle);
    }


}
