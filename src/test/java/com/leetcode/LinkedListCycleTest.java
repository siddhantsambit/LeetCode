package com.leetcode;

import com.leetcode.commons.ListNode;
import com.leetcode.problems.LinkedListCycle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LinkedListCycleTest {

    private LinkedListCycle linkedListCycle;

    @BeforeEach
    public void init() {
        linkedListCycle = new LinkedListCycle();
    }

    @Test
    public void test1() {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;
        Assertions.assertTrue(linkedListCycle.hasCycleSolution1(head));
    }

    @Test
    public void test2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = head;
        Assertions.assertTrue(linkedListCycle.hasCycleSolution1(head));
    }

    @Test
    public void test3() {
        ListNode head = new ListNode(1);
        Assertions.assertFalse(linkedListCycle.hasCycleSolution1(head));
    }

    @Test
    public void test4() {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;
        Assertions.assertTrue(linkedListCycle.hasCycleSolution2(head));
    }

    @Test
    public void test5() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = head;
        Assertions.assertTrue(linkedListCycle.hasCycleSolution2(head));
    }

    @Test
    public void test6() {
        ListNode head = new ListNode(1);
        Assertions.assertFalse(linkedListCycle.hasCycleSolution2(head));
    }
}
