package com.LinkedList;

class NodeI {
    int data;
    NodeI next;

    public NodeI(int data, NodeI next) {
        this.data = data;
        this.next = next;
    }

    public NodeI(int data) {
        this.data = data;
    }
}

public class FindTheIntersectionPoint {

    private static NodeI findIntersectionPointOptimal(NodeI head, NodeI head2) {
        NodeI t1 = head;
        NodeI t2 = head2;
        int n1 = 0;
        int n2 = 0;
        while (t1 != null) {
            t1 = t1.next;
            n1++;
        }
        while (t2 != null) {
            t2 = t2.next;
            n2++;
        }
        if (n1 > n2) {
            return collusion(head, head2, n1 - n2);
        } else {
            return collusion(head2, head, n2 - n1);
        }
    }

    private static NodeI collusion(NodeI t1, NodeI t2, int i) {
        NodeI temp = t1;
        while (i != 0) {
            t1 = t1.next;
            i--;
        }
        while (t1 != t2) {
            t1 = t1.next;
            t2 = t2.next;
        }
        return t2;
    }

    public static void main(String[] args) {
        NodeI head = new NodeI(1);
        NodeI t1 = new NodeI(2);
        NodeI t2 = new NodeI(3);
        NodeI t3 = new NodeI(4);
        NodeI t4 = new NodeI(5);
        NodeI t5 = new NodeI(6);
        NodeI t6 = new NodeI(7);
        NodeI head2 = new NodeI(8);
        NodeI t8 = new NodeI(9);
        NodeI t9 = new NodeI(10);
        head.next = t1;
        t1.next = t2;
        t2.next = t3;
        t3.next = t4;
        t4.next = t5;
        t5.next = t6;
        head2.next = t8;
        t8.next = t9;
        t9.next = t4;
        System.out.println(findIntersectionPointOptimal(head, head2).data);
        System.out.println(findIntersectionPointOptimalII(head, head2).data);

    }

    private static NodeI findIntersectionPointOptimalII(NodeI head, NodeI head2) {
        NodeI t1 = head;
        NodeI t2 = head2;
        while (t1 != t2) {
            t1 = t1.next;
            t2 = t2.next;
            if(t1 == t2)
                return  t1;
            if(t1 == null)
                t1 = head2;
            if(t2 == null)
                t2 = head;
        }
        return t1;
    }


}
