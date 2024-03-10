package com.leetcode.problems;

public class FindTheDuplicateNumber {

    /*
     * LeetCode-287 FindTheDuplicateNumber
     * Time Complexity : O(n)
     * Space Complexity : O(1)
     * Floyd's Cycle-Finding Algorithm
     */
    public static void main(String[] args) {
        int nums[] = {1, 3, 4, 2, 2};
        FindTheDuplicateNumber findTheDuplicateNumber = new FindTheDuplicateNumber();
        System.out.println(findTheDuplicateNumber.findDuplicate(nums));
        nums = new int[]{3, 1, 3, 4, 2};
        System.out.println(findTheDuplicateNumber.findDuplicate(nums));
        nums = new int[]{3, 3, 3, 3, 3};
        System.out.println(findTheDuplicateNumber.findDuplicate(nums));
        nums = new int[]{2, 5, 9, 6, 9, 3, 8, 9, 7, 1};
        System.out.println(findTheDuplicateNumber.findDuplicate(nums));
    }

    public int findDuplicate(int[] nums) {
        int fast = nums[0];
        int slow = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        slow = nums[0];

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
