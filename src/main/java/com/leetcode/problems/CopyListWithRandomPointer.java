package com.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer {

    /*
     * LeetCode-138 CopyListWithRandomPointer
     * Time Complexity : O(n)
     * Space Complexity : O(n)
     */
    public static void main(String[] args) {
        Node head = new Node(7);
        head.next = new Node(13);
        head.next.next = new Node(11);
        head.next.next.next = new Node(10);
        head.next.next.next.next = new Node(1);

        head.random = null;
        head.next.random = head;
        head.next.next.random = head.next.next.next.next;
        head.next.next.next.random = head.next.next;
        head.next.next.next.next.random = head;

        CopyListWithRandomPointer copyListWithRandomPointer = new CopyListWithRandomPointer();
        copyListWithRandomPointer.printList(head);
        head = copyListWithRandomPointer.copyRandomList(head);
        copyListWithRandomPointer.printList(head);
    }

    public void printList(Node node) {
        if(node == null) System.out.println("Empty List ...");
        else {
            while(node.next != null) {
                System.out.print("[" + node.val + "," + (node.random == null ? "null" : node.random.val) + "] -> ");
                node = node.next;
            }
            System.out.println("[" + node.val + "," + (node.random == null ? "null" : node.random.val) + "] -> null");
        }
    }

    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();
        Node node = head;
        while(node != null) {
            map.put(node, new Node(node.val));
            node = node.next;
        }

        node = head;

        while(node != null) {
            map.get(node).next = map.get(node.next);
            map.get(node).random = map.get(node.random);
            node = node.next;
        }

        return map.get(head);
    }
}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
    }
}
