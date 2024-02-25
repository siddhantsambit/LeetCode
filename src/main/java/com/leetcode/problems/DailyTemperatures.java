package com.leetcode.problems;

import java.util.Stack;

public class DailyTemperatures {

    /*
     * LeetCode-739 DailyTemperatures
     * Time Complexity - O(), n is length of input
     * Space Complexity : O(n)
     */
    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        DailyTemperatures dailyTemperatures = new DailyTemperatures();
        int a[] = dailyTemperatures.dailyTemperatures(temperatures);
        for (int i : a) System.out.print(i + "\t");
        System.out.println();
        temperatures = new int[]{30,40,50,60};
        a = dailyTemperatures.dailyTemperatures(temperatures);
        for (int i : a) System.out.print(i + "\t");
        System.out.println();
        temperatures = new int[]{30,60,90};
        a = dailyTemperatures.dailyTemperatures(temperatures);
        for (int i : a) System.out.print(i + "\t");

    }

    public int[] dailyTemperatures(int[] temperatures) {
        int ans[] = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i < temperatures.length; i++) {
            while (!stack.empty() && temperatures[stack.peek()] < temperatures[i]) {
                ans[stack.peek()] = i - stack.pop();
            }
            stack.push(i);
        }
        return ans;
    }
}
