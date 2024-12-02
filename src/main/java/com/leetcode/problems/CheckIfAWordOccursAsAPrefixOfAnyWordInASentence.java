package com.leetcode.problems;

public class CheckIfAWordOccursAsAPrefixOfAnyWordInASentence {

    /*
     * LeetCode-1455 CheckIfAWordOccursAsAPrefixOfAnyWordInASentence
     * Time Complexity : O(n), n is size of input string
     * Space Complexity : O(1)
     */
    public static void main(String[] args) {
        CheckIfAWordOccursAsAPrefixOfAnyWordInASentence checkIfAWordOccursAsAPrefixOfAnyWordInASentence =
                new CheckIfAWordOccursAsAPrefixOfAnyWordInASentence();

        String s1 = "i love eating burger";
        System.out.println(checkIfAWordOccursAsAPrefixOfAnyWordInASentence.isPrefixOfWord(s1, "burg"));
        String s2 = "this problem is an easy problem";
        System.out.println(checkIfAWordOccursAsAPrefixOfAnyWordInASentence.isPrefixOfWord(s2, "pro"));
        String s3 = "i am tired";
        System.out.println(checkIfAWordOccursAsAPrefixOfAnyWordInASentence.isPrefixOfWord(s3, "you"));

    }

    public int isPrefixOfWord(String sentence, String searchWord) {
        int i = 0;
        for(String str : sentence.split(" ")) {
            if(str.startsWith(searchWord)) {
                return i+1;
            }
            i++;
        }
        return  -1;
    }
}
