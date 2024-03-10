package com.leetcode.problems;

import com.leetcode.commons.ListNode;

public class AddTwoNumbers {

    /**
     * LeetCode-2 Add Two Numbers
     * Time Complexity : O(max(len(l1), len(l2)))
     * Space Complexity : O(max(len(l1), len(l2)))
     */
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next  = new ListNode(4);
        l1.next.next  = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next  = new ListNode(6);
        l2.next.next  = new ListNode(4);

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode head = addTwoNumbers.addTwoNumbers(l1, l2);
        head.printList(head);

        l1 = new ListNode(0);
        l2 = new ListNode(0);

        head = addTwoNumbers.addTwoNumbers(l1, l2);
        head.printList(head);

        l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);
        l1.next.next.next = new ListNode(9);
        l1.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next.next = new ListNode(9);

        l2 = new ListNode(9);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);

        head = addTwoNumbers.addTwoNumbers(l1, l2);
        head.printList(head);

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(-1);
        ListNode itr = dummy;
        int carry = 0;
        int sum = 0;

        while(l1 != null || l2 != null) {
            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            sum +=carry;
            itr.next = new ListNode(sum%10);
            itr = itr.next;
            carry = sum/10;
            sum = 0;
        }

        if(carry != 0)  itr.next = new ListNode(carry);

        return dummy.next;
    }
}
