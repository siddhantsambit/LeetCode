package com.leetcode.problems;

import java.util.Map;
import java.util.Stack;

public class MinStack {

    /*
    * LeetCode-155 Min Stack
    * Time Complexity - O(1)
    * Space Complexity - O(n), n is number of inputs
    */

    public static void main(String[] args) {
        MinStackSolution1 minStack = new MinStackSolution1();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // return -3
        minStack.pop();
        System.out.println(minStack.top());    // return 0
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());

        MinStackSolution2 minStack2 = new MinStackSolution2();
        minStack2.push(-2);
        minStack2.push(0);
        minStack2.push(-3);
        System.out.println(minStack2.getMin()); // return -3
        minStack2.pop();
        System.out.println(minStack2.top());    // return 0
        System.out.println(minStack2.getMin());
        minStack2.pop();
        System.out.println(minStack2.top());
    }
}

class MinStackSolution1 {


    private Stack<Integer> stack;
    private int min;

    public MinStackSolution1() {
        stack = new Stack<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int val) {
        if(val <= min) {
            stack.push(min);
            min = val;
        }
        stack.push(val);
    }

    public void pop() {
        if(min == stack.pop()) min = stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}

class MinStackSolution2 {

    private Stack<int[]> stack;

    public MinStackSolution2() {
        stack = new Stack<>();
    }

    public void push(int val) {
        if(!stack.empty()) {
            int top[] = stack.peek();
            int min = Math.min(val, top[1]);
            stack.push(new int[]{val, min});
        }
        else stack.push(new int[]{val, val});
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek()[0];
    }

    public int getMin() {
        return stack.peek()[1];
    }
}
