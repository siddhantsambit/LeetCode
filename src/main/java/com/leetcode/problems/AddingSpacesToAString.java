package com.leetcode.problems;

public class AddingSpacesToAString {

    /**
     * LeetCode-2109 AddingSpacesToAString
     * Time Complexity : O(n), n is length of input
     * Space Complexity : O(n)
     */
    public static void main(String[] args) {
        AddingSpacesToAString addingSpacesToAString = new AddingSpacesToAString();
        String s1 = "LeetcodeHelpsMeLearn";
        int spaces[] = {8,13,15};
        System.out.println(addingSpacesToAString.addSpaces(s1, spaces));
        s1 = "icodeinpython";
        spaces = new int[]{1,5,7,9};
        System.out.println(addingSpacesToAString.addSpaces(s1, spaces));
        s1 = "spacing";
        spaces = new int[]{0,1,2,3,4,5,6};
        System.out.println(addingSpacesToAString.addSpaces(s1, spaces));
    }

    public String addSpaces(String s, int[] spaces) {
        StringBuilder result = new StringBuilder();
        int start = 0;
        for(int space : spaces) {
            result.append(s, start, space).append(" ");
            start = space;
        }
        result.append(s.substring(start));
        return result.toString();
    }
}
