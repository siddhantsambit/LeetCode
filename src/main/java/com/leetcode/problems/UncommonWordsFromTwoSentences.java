package com.leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UncommonWordsFromTwoSentences {

    /*
    * LeetCode-884 UncommonWordsFromTwoSentences
    * Time Complexity : O(n+m), n is size of input string1 & m is size of input string2
    * Space Complexity : O(n)
    */
    public static void main(String[] args) {
        UncommonWordsFromTwoSentences uncommonWordsFromTwoSentences = new UncommonWordsFromTwoSentences();
        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";
        System.out.println(Arrays.toString(uncommonWordsFromTwoSentences.uncommonFromSentences(s1, s2)));
        s1 = "apple apple";
        s2 = "banana";
        System.out.println(Arrays.toString(uncommonWordsFromTwoSentences.uncommonFromSentences(s1, s2)));
    }

    public String[] uncommonFromSentences(String s1, String s2) {
        String words1[] = s1.split(" ");
        String words2[] = s2.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for(String word : words1) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for(String word : words2) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        ArrayList<String> ans = new ArrayList<>();
        map.forEach((k, v) -> {
            if(v == 1) ans.add(k);
        });
        return ans.toArray(new String[0]);
    }
}
