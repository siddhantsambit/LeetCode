package com.leetcode.problems;

import com.leetcode.commons.ListNode;
import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {

    /**
     * LeetCode-141 LinkedListCycle
     */

    /*
     * Time Complexity : O(n), n is length of Linked List
     * Space Complexity : O(n), HashMap
     */
    public boolean hasCycleSolution1(ListNode head) {
        Set<ListNode> visitedNodes = new HashSet<>();
        while(head != null) {
            if(visitedNodes.contains(head)) return true;
            visitedNodes.add(head);
            head = head.next;
        }
        return false;
    }

    /*
     * Time Complexity : O(n), n is length of Linked List
     * Space Complexity : O(1), Constant space
     * Floyd's Cycle-Finding Algorithm
     */
    public boolean hasCycleSolution2(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }
}
