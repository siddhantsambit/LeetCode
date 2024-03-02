package com.leetcode.problems;

import com.leetcode.commons.ListNode;

public class RemoveNthNodeFromEndOfList {

    public static void main(String[] args) {
        ListNode dummyNode = new ListNode();
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        ListNode head2 = new ListNode(1);

        ListNode head3 = new ListNode(1);
        head3.next = new ListNode(2);

        Solution1 solution1 = new Solution1();
        head1 = solution1.removeNthFromEnd(head1, 2);
        dummyNode.printList(head1);
        head2 = solution1.removeNthFromEnd(head2, 1);
        dummyNode.printList(head2);
        head3 = solution1.removeNthFromEnd(head3, 1);
        dummyNode.printList(head3);

        head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        head2 = new ListNode(1);

        head3 = new ListNode(1);
        head3.next = new ListNode(2);

        Solution2 solution2 = new Solution2();
        head1 = solution2.removeNthFromEnd(head1, 2);
        dummyNode.printList(head1);
        head2 = solution2.removeNthFromEnd(head2, 1);
        dummyNode.printList(head2);
        head3 = solution2.removeNthFromEnd(head3, 1);
        dummyNode.printList(head3);
    }
}

class Solution1 {

    /*
    * LeetCode-19 RemoveNthNodeFromEndOfList
    * Time Complexity : O(n)
    * Space Complexity : O(1)
    * Double Iteration
    */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode reverseHead = reverseList(head), prev = null, curr = reverseHead;
        while(--n > 0) {
            prev = curr;
            curr = curr.next;
        }
        if(prev == null) {
            prev = curr;
            curr = curr.next;
            // Detach the list
            prev.next = null;
            head = reverseList(curr);
        }
        else {
            prev.next = curr.next;
            curr.next = null;
            head = reverseList(reverseHead);
        }
        return head;
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = head;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}

class Solution2 {

    /*
     * LeetCode-19 RemoveNthNodeFromEndOfList
     * Optimized way
     * Time Complexity : O(n)
     * Space Complexity : O(1)
     * One Pass
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;

        while(fast.next != null) {
            if(n <= 0) slow = slow.next;
            fast = fast.next;
            n--;
        }

        if(slow.next != null) slow.next = slow.next.next;
        return dummy.next;
    }
}
