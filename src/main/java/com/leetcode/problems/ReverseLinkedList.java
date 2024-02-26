package com.leetcode.problems;

import com.leetcode.commons.ListNode;

public class ReverseLinkedList {

    /*
    * LeetCode-206 ReverseLinkedList
    * Time Complexity - O(n), n is length of linked list
    * Space Complexity - O(1), constant space
    */
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.printList(head);
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        head = reverseLinkedList.reverseList(head);
        head.printList(head);
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
