package com.leetcode.commons;

public class ListNode {

    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void printList(ListNode node) {
        if(node == null) System.out.println("Empty List ...");
        else {
            while(node.next != null) {
                System.out.print(node.val + " -> ");
                node = node.next;
            }
            System.out.println(node.val + " -> null");
        }
    }
}
