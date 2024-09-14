package com.leetcode.problems;

public class LongestSubarrayWithMaximumBitwiseAND {

    /*
    * LeetCode-2419 LongestSubarrayWithMaximumBitwiseAND
    * Time Complexity - O(n), n is the size of input
    * Space Complexity - O(1)
    */
    public static void main(String[] args) {
        LongestSubarrayWithMaximumBitwiseAND longestSubarrayWithMaximumBitwiseAND = new LongestSubarrayWithMaximumBitwiseAND();
        int nums[] = {1,2,3,3,2,2};
        System.out.println(longestSubarrayWithMaximumBitwiseAND.longestSubarray(nums));
        nums = new int[]{1,2,3,4};
        System.out.println(longestSubarrayWithMaximumBitwiseAND.longestSubarray(nums));
    }

    public int longestSubarray(int[] nums) {
        int max = nums[0], count = 0, len = 0;
        for(int i=0; i < nums.length; i++) {
            if(nums[i] == max) {
                count++;
                len = Math.max(count, len);
            }
            else if(nums[i] > max) {
                max = nums[i];
                count = 1;
                len = count;
            }
            else count = 0;
        }
        return len;
    }

}
