package com.leetcode.problems;

public class MinimumCostToMoveChipsToTheSamePosition {

    public static void main(String[] args) {
        int[] position = new int[]{1, 2, 3};
        MinimumCostToMoveChipsToTheSamePosition minimumCostToMoveChipsToTheSamePosition =
                new MinimumCostToMoveChipsToTheSamePosition();
        System.out.println(minimumCostToMoveChipsToTheSamePosition.minCostToMoveChips(position));
    }

    public int minCostToMoveChips(int[] position) {
        int even=0, odd=0;
        for(int p : position)
            if(p%2==0) even++;
            else odd++;
        return Math.min(even, odd);
    }
}
