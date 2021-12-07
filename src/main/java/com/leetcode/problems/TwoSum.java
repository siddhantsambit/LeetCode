package com.leetcode.problems;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    /**
     * LeetCode-1 TwoSum
     * HashMap implementation
     * Time Complexity : O(n), worst case : iterating over entire loop
     * Space Complexity : O(n) , worst case : filling up HashMap completely
     */

    public static void main(String[] args) {
        int nums[] = new int[]{2,7,11,15};
        int target = 9;
        TwoSum twoSum = new TwoSum();
        System.out.println(Arrays.toString(twoSum.twoSum(nums, target)));
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++)
            if(map.containsKey(target-nums[i])) return new int[]{map.get(target-nums[i]), i};
            else map.put(nums[i], i);

        return new int[]{-1,-1};
    }
}
