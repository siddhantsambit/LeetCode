package com.leetcode.problems;

public class MaximumSubArray {
    /**
     * LeetCode-53 MaximumSubarray
     * Time Complexity : O(n), size of the array
     * Space Complexity : O(1) , constant auxiliary space used
     * Algorithm - Greedy Kadane’s Algorithm
     */

    public static void main(String[] args) {
        MaximumSubArray maximumSubArray = new MaximumSubArray();
        int nums[] = new int[]{5,4,-1,7,8};
        System.out.println(maximumSubArray.maxSubArray(nums));
    }

    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int maxEndingHere = 0;
        int maxSoFar = Integer.MIN_VALUE;
        for(int i=0; i< nums.length; i++) {
            maxEndingHere = maxEndingHere + nums[i];
            if(maxEndingHere > maxSoFar) maxSoFar = maxEndingHere;
            if(maxEndingHere < 0) maxEndingHere = 0;
        }
        return maxSoFar;
    }
}
