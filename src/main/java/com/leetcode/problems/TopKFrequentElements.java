package com.leetcode.problems;

import java.util.*;

public class TopKFrequentElements {

    /**
     * LeetCode-347 ContainsDuplicate
     * Time Complexity : O(nlogn), n is the size of the array
     * Space Complexity : O(n)
     */

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2};
        int k = 2;
        TopKFrequentElements topKFrequentElements = new TopKFrequentElements();
        System.out.println(Arrays.toString(topKFrequentElements.topKFrequent(nums,k)));
        nums = new int[]{1};
        k=1;
        System.out.println(Arrays.toString(topKFrequentElements.topKFrequent(nums,k)));
    }

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans[] = new int[k];
        for(int i : nums)
            map.put(i, map.getOrDefault(i,0)+1);
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> map.get(o2)- map.get(o1));

        for(int i : map.keySet()) queue.add(i);

        for(int i=0; i<k; i++) ans[i] = queue.poll();
        return ans;
    }
}
