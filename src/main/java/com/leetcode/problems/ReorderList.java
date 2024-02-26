package com.leetcode.problems;

import com.leetcode.commons.ListNode;

public class ReorderList {

    /*
    * LeetCode-143 ReorderList
    * Time Complexity - O(n)
    * Space Complexity - O(1)
    */
    public static void main(String args[]) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ReorderList reorderList = new ReorderList();
        reorderList.reorderList(head);
        head.printList(head);

        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        reorderList.reorderList(head);
        head.printList(head);
    }

    public void reorderList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) return;

        ListNode fast = head;
        ListNode slow = head;

        // Two pointers to find middle element
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode head1 = head;
        ListNode head2 = slow.next;

        //Detach list
        slow.next = null;

        // Reverse Second sublist
        ListNode prev = null;
        ListNode curr = head2;
        ListNode next = null;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head2 = prev;

        ListNode mergedHead = new ListNode(-1);
        ListNode current = mergedHead;
        while(head1 != null && head2 != null) {
            ListNode temp1 = head1.next;
            current.next = head1;
            head1 = temp1;
            current = current.next;
            ListNode temp2 = head2.next;
            current.next = head2;
            head2 = temp2;
            current = current.next;
        }

        current.next = (head1 == null) ? head2 : head1;
        head = mergedHead.next;
    }
}
