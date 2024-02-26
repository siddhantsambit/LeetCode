package com.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public static void main(String[] args) {
        GenerateParentheses generateParentheses = new GenerateParentheses();
        generateParentheses.generateParenthesis(3).forEach(System.out::println);
        System.out.println();
        generateParentheses.generateParenthesis(1).forEach(System.out::println);
    }

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backtrackingHelper(list, new StringBuilder(), 0, 0, n);
        return list;
    }

    private void backtrackingHelper(List<String> list, StringBuilder str, int open, int close, int n) {
        if(close > open) return;

        if(open == close && str.length() == (2*n)) {
            list.add(str.toString());
            return;
        }

        if(open < n) {
            str.append("(");
            backtrackingHelper(list, str, open+1, close, n);
            str.deleteCharAt(str.length()-1);
        }

        if(close < open) {
            str.append(")");
            backtrackingHelper(list, str, open, close+1, n);
            str.deleteCharAt(str.length()-1);
        }
    }
}
