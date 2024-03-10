package com.leetcode.problems;

import com.leetcode.commons.ListNode;
import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;

        LinkedListCycleSolution1 solution1 = new LinkedListCycleSolution1();
        System.out.println(solution1.hasCycle(head));

        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = head;
        System.out.println(solution1.hasCycle(head));

        head = new ListNode(1);
        System.out.println(solution1.hasCycle(head));

        LinkedListCycleSolution2 solution2 = new LinkedListCycleSolution2();
        head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;

        System.out.println(solution2.hasCycle(head));

        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = head;
        System.out.println(solution2.hasCycle(head));

        head = new ListNode(1);
        System.out.println(solution2.hasCycle(head));

    }
}

class LinkedListCycleSolution1 {

    /*
     * LeetCode-141 LinkedListCycle
     * Time Complexity : O(n), n is length of Linked List
     * Space Complexity : O(n)
     * HashMap
     */
    public boolean hasCycle(ListNode head) {
        Set<ListNode> visited_nodes = new HashSet<>();
        while(head != null) {
            if(visited_nodes.contains(head)) return true;
            visited_nodes.add(head);
            head = head.next;
        }
        return false;
    }
}

class LinkedListCycleSolution2 {

    /*
     * LeetCode-141 LinkedListCycle
     * Time Complexity : O(n), n is length of Linked List
     * Space Complexity : O(1)
     * Floyd's Cycle-Finding Algorithm
     */
    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }
}
