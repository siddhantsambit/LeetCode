package com.leetcode.problems;

import java.util.*;

public class KthLargest {

    /**
     * LeetCode-1046 Kth Largest Element in a Stream
     * Time Complexity : O(nlogn)
     * Auxiliary Space Complexity : O(n)
     */

    private PriorityQueue<Integer> heap;
    private int max;


    public static void main(String[] args) {
        int k = 3;
        int nums[] = new int[]{4, 5, 8, 2};

        KthLargest obj = new KthLargest(k, nums);
        System.out.println(obj.add(3));
        System.out.println(obj.add(5));
        System.out.println(obj.add(10));
        System.out.println(obj.add(9));
        System.out.println(obj.add(4));
    }

    public KthLargest(int k, int[] nums) {
        heap = new PriorityQueue<>(k+1);
        for(int num : nums) {
            heap.offer(num);
            if(heap.size() > k) heap.poll();
        }
        max = k;
    }

    public int add(int val) {
        heap.offer(val);

        if (heap.size() > max)
            //if the size reached k+1 remove the minimum element
            heap.poll();

        return heap.peek();
    }
}
