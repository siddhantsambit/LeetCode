package com.leetcode.problems;

public class ValidAnagram {
    /**
     * LeetCode-242 ValidAnagram
     * Time Complexity : O(n)
     * Space Complexity : O(26)
     */
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] freqS = getFrequencyArr(s);
        int[] freqT = getFrequencyArr(t);
        for(int i=0; i<26; i++)
            if(freqS[i] != freqT[i])
                return false;
        return true;
    }

    private int[] getFrequencyArr(String str) {
        int freq[] = new int[26];
        for(char c : str.toCharArray()) freq[c-'a']++;
        return freq;
    }
}
