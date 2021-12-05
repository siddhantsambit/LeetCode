package com.leetcode.problems;

public class StreamOfCharacters {

    /**
     * LeetCode -1032 StreamOfCharacters
     */

    public static void main(String[] args) {
        // write your code here
        StreamChecker streamChecker = new StreamChecker(new String[]{"cd", "f", "kl"});
        char[] input = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l'};
        for(char c : input) {
            System.out.println(streamChecker.query(c));
        }
    }
}

class StreamChecker {

    private TrieNode root = null;
    private StringBuilder queryString = null;

    private class TrieNode {
        private TrieNode[] children = null;
        private boolean isLeaf;
        public TrieNode() {
            children = new TrieNode[26];
        }

    }
    public StreamChecker(String[] words) {
        root = new TrieNode();
        queryString = new StringBuilder();
        for(String word : words) {
            addWords(word);
        }
    }

    private void addWords(String word) {
        TrieNode it = root;
        for(int i=word.length()-1; i>=0; i--) {
            char c = word.charAt(i);
            int index = c - 'a';
            if(it != null && it.children[index] == null) {
                TrieNode newNode = new TrieNode();
                it.children[index] = newNode;
            }
            it = it.children[index];
        }
        it.isLeaf = true;
    }

    public boolean query(char letter) {
        queryString.append(letter);
        return search(queryString.toString());
    }

    private boolean search(String queryStr) {
        TrieNode it  = root;
        for(int i=queryStr.length()-1; i>=0; i--) {
            char c = queryStr.charAt(i);
            int index = c - 'a';
            if(it != null && it.children[index] != null) {
                it = it.children[index];
                if(it.isLeaf) return true;
            }
            else {
                return false;
            }
        }
        return false;
    }
}
