package com.leetcode.problems;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    /*
     * LeetCode-49 GroupAnagrams
     * TimeComplexity : O(n * len) , n is size of array of Strings and len is size of each string
     * Space Compliexity : O(n)
     */
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        System.out.println(groupAnagrams.groupAnagrams(strs));
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs) {
            String key = buildKey(str);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<>(map.values());
    }

    private String buildKey(String str) {
        char[] keyChars = new char[26];
        for(char c : str.toCharArray()) keyChars[c - 'a'] ++;
        return new String(keyChars);
    }
}
