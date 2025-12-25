package com.LinkedList;

class  Node1{
    int data;
    Node1 next;
    Node1(int data, Node1 next){
        this.data = data;
        this.next = next;
    }
    Node1(){

    }
    Node1(int data){
        this.data = data;
    }
    public String toString(){
        return data +"->"+ next;
    }
}
public class ArrayToLinkedList {
    public static  void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        converArrayToList(arr);
    }

    private static void converArrayToList(int[] arr) {
        Node1 head = new Node1(arr[0]);
        Node1 previous = head;
        for(int i =1;i<arr.length;i++){
            Node1 temp = new Node1(arr[i]);
            previous.next = temp;
            previous = temp;
        }
        System.out.println(head);
    }
}
