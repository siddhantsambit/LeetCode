package com.leetcode.problems;

import com.leetcode.commons.ListNode;

public class MergeTwoSortedLists {

    /*
    * LeetCode-21 MergeTwoSortedLists
    * Time Complexity : O(n+m), n = size of list 1 & m = size of list 2
    * Space Complexity : O(1)
    */

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        ListNode list = mergeTwoSortedLists.mergeTwoLists(list1, list2);
        list.printList(list);

    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergedList = new ListNode(-1);
        ListNode curr = mergedList;
        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                curr.next = list1;
                list1 = list1.next;
            }
            else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        curr.next = (list1 == null) ? list2 : list1;
        return mergedList.next;
    }
}
