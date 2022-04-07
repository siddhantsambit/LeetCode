package com.leetcode.problems;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {

    /**
     * LeetCode-1046
     * Time Complexity : O(nlogn), worst case
     * Auxiliary Space Complexity : O(n) , worst case
     *
     */

    public static void main(String[] args) {
        int stones[] = new int[]{2,7,4,1,8,1};
        LastStoneWeight lastStoneWeight = new LastStoneWeight();
        System.out.println(lastStoneWeight.lastStoneWeight(stones));
    }

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone: stones) maxHeap.offer(stone);

        while (!maxHeap.isEmpty()) {
            if(maxHeap.size() > 1) maxHeap.offer(maxHeap.poll() - maxHeap.poll());
            else return maxHeap.poll();
        }
        return -1;
    }
}
