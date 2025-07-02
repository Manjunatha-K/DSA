package com.logic.DSA.DoublyLinkedList;

public class DeletionInADLL {
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
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10};
        int index = 10;
        Node head = DoublylinkedListImpl(arr);
        Node updatedHead = deleteElement(head,index);
        System.out.println("After Deletion");
        Node temp = updatedHead;
        Node reverseTemp = null;
        while (temp!= null){
            System.out.println(temp.data);
            reverseTemp = temp;
            temp = temp.next;
        }
        System.out.println("Reverse");
        while (reverseTemp!= null){
            System.out.println(reverseTemp.data);
            reverseTemp = reverseTemp.previous;
        }
    }

    private static Node deleteElement(Node head, int index) {
        int len = findLength(head);
        if(index>len){
            System.out.println("Invalid Index!!! Please try again");
            return head;
        }else if(head == null && index ==0){
            return head;
        }else if(head != null && index ==0){
            head = head.next;
            head.previous = null;
            return head;
        }else if(len == index || len-1 == index){
            Node temp = head;
            Node previous = null;
            while(temp.next!= null){
                previous = temp;
                temp = temp.next;
            }
            previous.next = null;
            temp.previous = null;
            return head;
        }else{
            int counter =-1;
            Node temp = head;
            Node previous = null;
            while(temp!= null){
                counter++;
                 previous = temp;
                temp = temp.next;
                if(counter == index-1){
                    break;
                }
            }
            temp.previous = null;
            previous.next = temp.next;
            temp.next = null;
            previous.next.previous = previous;
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
