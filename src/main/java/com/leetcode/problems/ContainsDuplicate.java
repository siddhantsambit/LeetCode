package com.leetcode.problems;

import java.util.HashSet;

public class ContainsDuplicate {

    /**
     * LeetCode-217 ContainsDuplicate
     * Time Complexity : O(n), worst case
     * Space Complexity : O(n) , worst case
     */

    public static void main(String[] args) {
        int nums[] = new int[]{1,2,3,4};
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        System.out.println(containsDuplicate.containsDuplicate(nums));
    }
    public boolean containsDuplicate(int[] nums) {
        if(nums == null && nums.length == 0) return false;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums)
        if(!set.add(num)) return true;
        return false;
    }
}
