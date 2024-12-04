package com.leetcode.problems;

public class MakeStringASubsequenceUsingCyclicIncrements {

    /**
     * LeetCode-2825 MakeStringASubsequenceUsingCyclicIncrements
     * Time Complexity : O(n), n is length of input
     * Space Complexity : O(1)
     */
    public static void main(String[] args) {
        MakeStringASubsequenceUsingCyclicIncrements makeStringASubsequenceUsingCyclicIncrements
                = new MakeStringASubsequenceUsingCyclicIncrements();
        String str1 = "abc";
        String str2 = "ad";
        System.out.println(makeStringASubsequenceUsingCyclicIncrements.canMakeSubsequence(str1, str2));
        str1 = "zc";
        str2 = "ad";
        System.out.println(makeStringASubsequenceUsingCyclicIncrements.canMakeSubsequence(str1, str2));
        str1 = "ab";
        str2 = "d";
        System.out.println(makeStringASubsequenceUsingCyclicIncrements.canMakeSubsequence(str1, str2));
    }

    public boolean canMakeSubsequence(String str1, String str2) {
        int targetIdx = 0, targetLen = str2.length();
        for(char currChar : str1.toCharArray()) {
            if(targetIdx < targetLen && ((str2.charAt(targetIdx) - currChar + 26) % 26) <= 1) {
                targetIdx++;
            }
        }
        return (targetIdx == targetLen);
    }
}
