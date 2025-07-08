package com.logic.DSA.LinkedList;

import java.util.Stack;

public class ReverseLLUsingStack {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Node head = MovetoLinkedList(arr);
        reverseLLUsingStack(head);
    }

    private static void reverseLLUsingStack(Node head) {
        Stack<Integer> st = new Stack<>();
        Node currentNode = head;
        while(currentNode != null){
            st.push(currentNode.data);
            currentNode = currentNode.next;
        }
        System.out.println("REVERSING");
        Node newHead = new Node(st.pop());
        Node newCurrentNode = newHead;
        while(!st.empty()){
            Node temp = new Node(st.pop());
            newCurrentNode.next = temp;
            newCurrentNode = newCurrentNode.next;
        }
        System.out.println("AFTER REVERSING");
        while(newHead != null){
            System.out.println(newHead.data);
            newHead = newHead.next;
        }
    }

    private static Node MovetoLinkedList(int[] arr) {
        Node head = new Node(arr[0]);
        Node currentNode = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            currentNode.next = temp;
            currentNode = currentNode.next;
        }
        return head;
    }
}
