package com.logic.DSA.LinkedList;

public class FindMiddleElement {
    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        LLNode head = convertArraytoLinkedList(arr);
        System.out.println("AFTER CONVERSION");
        LLNode currentNode = head;
        while(currentNode != null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
        findMiddleElement(head);
    }

    private static void findMiddleElement(LLNode head) {
        LLNode fastPointer = head;
        LLNode slowPointer = head;
        while(fastPointer != null && fastPointer.next != null){
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }
        System.out.println("SLOW POINTER IS : "+ slowPointer.data);
    }

    private static LLNode convertArraytoLinkedList(int[] arr) {
        LLNode head = new LLNode(arr[0]);
        LLNode tempHead = head;
        for (int i = 1; i < arr.length; i++) {
            LLNode temp = new LLNode(arr[i]);
            tempHead.next = temp;
            tempHead = tempHead.next;
        }
        return head;
    }
}

class LLNode {
    Integer data;
    LLNode next;

    LLNode() {

    }

    LLNode(Integer data) {
        this.data = data;
        this.next = null;
    }

    LLNode(Integer data, LLNode next) {
        this.data = data;
        this.next = next;
    }
}
