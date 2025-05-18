package com.leetcode.problems;

public class BinarySearch {

    /**
     * LeetCode-242 BinarySearch
     * Time Complexity : O(log n)
     * Space Complexity : O(1)
     */
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        while(low <= high) {
            int mid = low + (high-low)/2;
            if(nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid+1;
            } else {
                high = mid -1;
            }
        }
        return -1;
    }
}
