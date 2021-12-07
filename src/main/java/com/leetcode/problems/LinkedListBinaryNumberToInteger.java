package com.leetcode.problems;

import com.leetcode.commons.ListNode;

public class LinkedListBinaryNumberToInteger {

    /**
     * LeetCode-1290 ConvertBinaryNumberInALinkedListToInteger
     * Time Complexity : O(n),
     * Space Complexity : O(1) ,
     */

    public int getDecimalValue(ListNode head) {
        int num = head.val;
        while(head.next != null) {
            num = (num<<1) | head.next.val;
            head = head.next;
        }
        return num;
    }
}
