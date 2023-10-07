package com.leetcode.problems;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    /*
    * LeetCode-128 LongestConsecutiveSequence
    * Time Complexity - O(n)
    * Space Complexity - O(n)
    */

    public static void main(String[] args) {
        LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
        int nums[] = {100, 4, 200, 1, 3, 2, 29, 27, 28, 24, 26, 25};
        System.out.println(longestConsecutiveSequence.longestConsecutive(nums));
        nums = new int[]{100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutiveSequence.longestConsecutive(nums));
        nums = new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println(longestConsecutiveSequence.longestConsecutive(nums));
    }

    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);
        int count = 1, maxLen = 0;
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int currNum = num;
                while (set.contains(currNum + 1)) {
                    count++;
                    currNum++;
                }
            }
            maxLen = Math.max(count, maxLen);
            count = 1;
        }
        return maxLen;
    }
}
