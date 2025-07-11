package com.leetcode.problems;

public class FloodFill {

    /**
     * LeetCode-242 FloodFill
     * Time Complexity : O(n * m)
     * Space Complexity : O(1)
     * TODO - To check on BFS
     */
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        // As starting pixel is already colored with target color. Therefore, no changes to the image
        if(image[sr][sc] == color) return  image;
        // DFS and backtracking to perform fill action from the starting pixel
        fill(image, sr, sc, color, image[sr][sc]);
        return image;
    }

    private void fill(int[][] image, int sr, int sc, int color, int startingPixel) {
        // Conditions to avoid IndexOutOfBoundException
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length) return;
        // If current pixel (image[sr][sc]) is not same as starting pixel then return to backtrack
        if(startingPixel != image[sr][sc]) return;
        // Updating the color if current pixel (image[sr][sc]) is same as starting pixel
        image[sr][sc] = color;
        // Make four recursive calls to traverse in four directions
        fill(image, sr-1, sc, color, startingPixel);
        fill(image, sr+1, sc, color, startingPixel);
        fill(image, sr, sc-1, color, startingPixel);
        fill(image, sr, sc+1, color, startingPixel);
    }
}
