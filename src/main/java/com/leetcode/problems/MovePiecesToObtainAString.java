package com.leetcode.problems;

public class MovePiecesToObtainAString {

    /**
     * LeetCode-2337 MovePiecesToObtainAString
     * Time Complexity : O(n), n is length of input
     * Space Complexity : O(1)
     */
    public static void main(String[] args) {
        MovePiecesToObtainAString movePiecesToObtainAString = new MovePiecesToObtainAString();
        String s1 = "_L__R__R_";
        String s2 = "L______RR";
        System.out.println(movePiecesToObtainAString.canChange(s1, s2));
        s1 = "R_L_";
        s2 = "__LR";
        System.out.println(movePiecesToObtainAString.canChange(s1, s2));
        s1 = "_R";
        s2 = "R_";
        System.out.println(movePiecesToObtainAString.canChange(s1, s2));
    }

    public boolean canChange(String start, String target) {
        int startLength = start.length();
        int startIndex = 0, targetIndex = 0;
        while(startIndex < startLength || targetIndex < startLength) {
            while(startIndex < startLength && start.charAt(startIndex) == '_') {
                startIndex++;
            }
            while(targetIndex < startLength && target.charAt(targetIndex) == '_') {
                targetIndex++;
            }
            if (startIndex == startLength || targetIndex == startLength) {
                return (startIndex == startLength && targetIndex == startLength);
            }
            if(start.charAt(startIndex) != target.charAt(targetIndex)
                    || (start.charAt(startIndex) == 'L' && startIndex < targetIndex)
                    || (start.charAt(startIndex) == 'R' && startIndex > targetIndex)) {
                return false;
            }
            startIndex++;
            targetIndex++;
        }
        return true;
    }
}
