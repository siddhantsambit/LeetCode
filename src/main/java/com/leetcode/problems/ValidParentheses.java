package com.leetcode.problems;

import java.util.Stack;

public class ValidParentheses {

    /*
    * LeetCode-20 Valid Parentheses
    * Time Complexity - O(n), n is length of input string
    * Space Complexity - O(n), worst case
    */

    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        String s = "()";
        System.out.println(validParentheses.isValid(s));
        s = "()[]{}";
        System.out.println(validParentheses.isValid(s));
        s = "(]";
        System.out.println(validParentheses.isValid(s));
    }

    public boolean isValid(String s) {
        if(s == null || s.length() == 0) return true;

        Stack<Character> stack = new Stack<>();
        for(int i=0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            else if (stack.empty() || !isMatching(stack.pop(), c)) {
                return false;
            }
        }
        return stack.empty();
    }

    private boolean isMatching(char open, char close) {
        return ((open == '(' && close == ')') || (open == '[' && close == ']') || (open == '{' && close == '}'));
    }
}
