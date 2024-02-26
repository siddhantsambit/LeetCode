package com.leetcode.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

public class EvaluateReversePolishNotation {

    /*
    * LeetCode-217 EvaluateReversePolishNotation
    * Time Complexity - O(n), n is length of input
    * Space Complexity : O(n)
    */
    public static void main(String[] args) {
        EvaluateReversePolishNotation evaluateReversePolishNotation = new EvaluateReversePolishNotation();
        int a[] = {1,2,3};
        String[] tokens = {"2","1","+","3","*"};
        System.out.println(evaluateReversePolishNotation.evalRPN(tokens));
        tokens = new String[]{"4","13","5","/","+"};
        System.out.println(evaluateReversePolishNotation.evalRPN(tokens));
        tokens = new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(evaluateReversePolishNotation.evalRPN(tokens));
    }
    public int evalRPN(String[] tokens) {
        HashSet<String> operators = new HashSet<>(Arrays.asList("+", "-", "*", "/"));
        Stack<Integer> stack = new Stack<>();
        for(String token : tokens) {
            if(operators.contains(token)) {
                int secondNum = stack.pop();
                int firstNum = stack.pop();
                int result;
                switch (token) {
                    case "+":
                        result = firstNum + secondNum;
                        break;
                    case "-":
                        result = firstNum - secondNum;
                        break;
                    case "*":
                        result = firstNum * secondNum;
                        break;
                    default:
                        result = firstNum / secondNum;
                }
                stack.push(result);
            }
            else {
                int num = Integer.parseInt(token);
                stack.push(num);
            }
        }
        return stack.pop();
    }
}
