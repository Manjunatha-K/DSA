package com.LinkedList;


import java.sql.SQLOutput;
import java.util.*;

class Node {
    int data;
    Node next;

    Node() {

    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public String toString() {
        return data + "->" + next;
    }
}

public class TraversalLinkedList {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1};
        Node head = convertArrayToList(arr);
        /*
        Node head = new Node(1);
        Node t2 = new Node(2);
        Node t3 = new Node(3);
        Node t4 = new Node(4);
        Node t5 = new Node(5);
        Node t6 = new Node(6);
        Node t7 = new Node(7);
        Node t8 = new Node(8);
        Node t9 = new Node(9);
        Node t10 = new Node(10);
        head.next = t2;
        t2.next = t3;
        t3.next = t4;
        t4.next = t5;
        t5.next = t6;
        t6.next = t7;
        t7.next = t8;
        t8.next = t9;
        t9.next = t10;
        t10.next = t6;
*/
        //traversal(head);
        //findLength(head);
        int searchElement = 7;
        // serachInAList(head, searchElement);
        //deletingHead(head);
        //deletingTail(head);
        //deletingKthElement(6, head);
        //deleteElementBasedonValue(head,7);
        //findMiddleElementBrute(head);
        //findMiddleElementOptimal(head);
        //reverseLinkedList(head);
        // ReversingLinkedListBrute(head);
        findLengthOfaLoopBrute(head);
        findLengthOfALoopOptimal(head);
        // removeNthNodeFromEnd(head, 10);
        //deleteMiddleNode(head);
        findPalindrome(head);

        Node start = findStartingPointOfLoop(head);
        if (start != null)
            System.out.println("Starting point is : " + start.data);
        else System.out.println("No loop");
        if (detectLoopBrute(head)) {
            System.out.println("LOOP PRESENT");
        } else {
            System.out.println("NO LOOP");
        }


        if (detectLoopOptimal(head)) {
            System.out.println("OPTIMAL LOOP PRESENT");
        } else {
            System.out.println("OPTIMAL NO LOOP");
        }

    }

    private static void findPalindrome(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        Node newHead = reverseLinkedList(slow.next);
        Node first = head;
        Node second = newHead;
        while (second != null) {
            if (second.data != first.data) {
                System.out.println("NOT PALINDROME");
                reverseLinkedList(newHead);
                return;
            }
            second = second.next;
            first = first.next;

        }
        reverseLinkedList(newHead);
        System.out.println("PALINDROME");
    }

    private static void deleteMiddleNode(Node head) {
        Node slow = head;
        Node fast = head;
        if (fast == null || fast.next == null) {
            System.out.println("SINGLE ELEMENT");
            System.out.println("MIDDLE ELEMENT IN A SINGLE ELEMENT IS : " + head.data);
            head = null;
            return;
        }
        fast = fast.next.next;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println("MIDDLE ELEMENT TO BE DELETED IS : " + slow.next.data);
        slow.next = slow.next.next;
        System.out.println("AFTER DELETION OF MIDDLE NODE");
        traversal(head);
    }

    private static void removeNthNodeFromEnd(Node head, int n) {
        Node slow = head;
        Node fast = head;
        for (int i = 0; i < n; i++) {
            if (fast != null)
                fast = fast.next;
            else {
                System.out.println(" N is grater than the length of a list");
                return;
            }
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;

        }
        if (fast == null) {
            head = head.next;
            traversal(head);
            return;
        }
        System.out.println("DELETED ELEMENT IS : " + slow.next.data);
        slow.next = slow.next.next;
        System.out.println("AFTER DELETION OF NTH NODE IS : ");
        traversal(head);

    }

    private static void findLengthOfALoopOptimal(Node head) {
        Node slow = head;
        Node fast = head;
        int counter = 0;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                fast = fast.next;
                counter = 1;
                while (fast != slow) {
                    fast = fast.next;
                    counter++;
                }
                break;
            }
        }
        if (counter == 0)
            System.out.println("NO LOOP");
        else
            System.out.println("LOOP FOUND and LENGTH IS : " + counter);
    }

    private static void findLengthOfaLoopBrute(Node head) {
        Node temp = head;
        int timer = 1;
        Map<Node, Integer> mpp = new HashMap<>();
        while (temp != null) {
            if (mpp.containsKey(temp)) {
                int index = mpp.get(temp);
                System.out.println("Length of a loop is : " + (timer - index));
                return;
            }
            mpp.put(temp, timer);
            timer++;
            temp = temp.next;
        }
        System.out.println("NO loop found");
    }

    private static Node findStartingPointOfLoop(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }

    private static boolean detectLoopOptimal(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast)
                return true;

        }
        return false;
    }

    private static Boolean detectLoopBrute(Node head) {
        Node temp = head;
        HashSet<Node> set = new HashSet<>();
        while (temp != null) {
            if (set.contains(temp)) {
                System.out.println("LOOP IS PRESENT");
                return true;
            }
            set.add(temp);
            temp = temp.next;
        }
        return false;
    }

    private static void reversingLinkedListBrute(Node head) {
        Stack<Integer> st = new Stack<>();
        Node temp = head;
        while (temp != null) {
            st.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            temp.data = st.pop();
            temp = temp.next;
        }
        System.out.println("REVERSING USING BRUTE");
        traversal(head);
    }

    private static Node reverseLinkedList(Node head) {
        Node currentNode = head;
        Node next = null;
        Node previous = null;
        while (currentNode != null) {

            next = currentNode.next;
            currentNode.next = previous;
            previous = currentNode;
            currentNode = next;

        }
        System.out.println("AFTER REVERSING ");
        traversal(previous);
        return head;
    }

    private static void findMiddleElementOptimal(Node head) {
        Node slowPointer = head;
        Node fastPointer = head;
        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        System.out.println("Middle element using optimal solution is : " + slowPointer.data);
    }

    private static void findMiddleElementBrute(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int mid = count / 2 + 1;
        Node currentNode = head;
        while (currentNode != null) {
            mid--;
            if (mid == 0) {
                System.out.println("Middle element is : " + currentNode.data);
                return;
            }
            currentNode = currentNode.next;
        }
    }

    private static void deleteElementBasedonValue(Node head, int i) {
        Node temp = head;
        Node previousNode = null;
        while (temp != null && temp.next != null) {
            if (temp.data != i) {
                previousNode = temp;
                temp = temp.next;
            } else {
                previousNode.next = temp.next;
                break;
            }
        }
        System.out.println("After deleting based on value is :");
        traversal(head);
    }

    private static void deletingKthElement(int i, Node head) {
        int count = 0;
        Node temp = head;
        Node previousNode = null;
        while (temp != null && temp.next != null) {
            if (count < i) {
                previousNode = temp;
                temp = temp.next;
                count++;
            } else {
                break;
            }

        }
        int value = temp.data;
        previousNode.next = temp.next;
        System.out.println("Element deleted at kth position is : " + value);
        System.out.println("After deleting kth element");
        traversal(head);
    }

    private static void deletingTail(Node head) {
        if (head == null) {
            return;
        } else if (head.next == null) {
            head = null;
        } else {
            Node temp = head;
            Node previous = head;
            while (temp.next != null) {
                previous = temp;
                temp = temp.next;
            }
            int deletingElement = previous.data;
            System.out.println("The deleting value at tail is : " + deletingElement);
            previous.next = null;
        }
        System.out.println("After deleting tail ");
        traversal(head);
    }

    private static void deletingHead(Node head) {
        if (head == null)
            return;
        else {
            head = head.next;
        }
        System.out.println("After deletion of head ");
        traversal(head);
    }

    private static void serachInAList(Node head, int searchElement) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == searchElement) {
                System.out.println("Search element is present and the value is : " + temp.data);
                return;
            } else {
                temp = temp.next;
            }
        }
        System.out.println("Search element is not present");
    }

    private static void findLength(Node head) {
        Node temp = head;
        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        System.out.println("Length of a linked list is : " + length);
    }

    private static void traversal(Node head) {
        Node temp = head;
        System.out.println("TRAVERSAL");
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    private static Node convertArrayToList(int[] arr) {
        Node head = new Node(arr[0]);
        Node previous = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            previous.next = temp;
            previous = temp;
        }
        System.out.println("After converting to List");
        System.out.println("Head is " + head);
        return head;
    }
}
