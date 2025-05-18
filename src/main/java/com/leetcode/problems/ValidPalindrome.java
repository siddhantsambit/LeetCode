package com.leetcode.problems;

public class ValidPalindrome {

    /**
     * LeetCode-125 ValidPalindrome
     * Time Complexity : O(n), Time Complexity
     * Space Complexity : O(1), Space Complexity
     */
    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        String s = "A man, a plan, a canal: Panama";
        System.out.println(validPalindrome.isPalindrome(s));
        s = "race a car";
        System.out.println(validPalindrome.isPalindrome(s));
        s = " ";
        System.out.println(validPalindrome.isPalindrome(s));
    }

    public boolean isPalindrome(String s) {
        if(s == null || s.isEmpty()) return true;
        int start = 0, end = s.length() - 1;
        while(start <= end) {
            char currStart = s.charAt(start);
            char currEnd = s.charAt(end);
            if(!Character.isLetterOrDigit(currStart)) start++;
            else if(!Character.isLetterOrDigit(currEnd)) end--;
            else {
                if(Character.toLowerCase(currStart) != Character.toLowerCase(currEnd))
                    return false;
                start++;
                end--;
            }
        }
        return true;
    }
}
