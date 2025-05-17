package com.leetcode.problems;

public class BestTimeToBuyAndSellStocks {

    /**
     * LeetCode-121 Best Time to Buy and Sell Stock
     * Time Complexity : O(max(len(l1), len(l2)))
     * Space Complexity : O(max(len(l1), len(l2)))
     */
    public static void main(String[] args) {
        BestTimeToBuyAndSellStocks bestTimeToBuyAndSellStocks = new BestTimeToBuyAndSellStocks();
        int nums[] = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(bestTimeToBuyAndSellStocks.maxProfit(nums));
        nums = new int[]{7, 6, 4, 3, 1};
        System.out.println(bestTimeToBuyAndSellStocks.maxProfit(nums));
    }

    public int maxProfit(int[] prices) {
        int leastPrice = Integer.MAX_VALUE, overallProfit = 0, profitIfSoldToday = 0;
        for(int i=0; i < prices.length; i++) {
            if(prices[i] < leastPrice) leastPrice = prices[i];
            profitIfSoldToday = prices[i] - leastPrice;
            if(overallProfit < profitIfSoldToday) overallProfit = profitIfSoldToday;
        }

        return overallProfit;
    }
}
