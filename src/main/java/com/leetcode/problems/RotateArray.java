package com.leetcode.problems;

public class RotateArray {

    /*
     * LeetCode-189 RotateArray
     * TimeComplexity : O(n) , n is length of input array
     * Space Compliexity : O(1)
     */
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(nums, k);
        for (int i : nums) System.out.print(i + "\t");
        System.out.println();
        nums = new int[]{-1, -100, 3, 99};
        k = 2;
        rotateArray.rotate(nums, k);
        for (int i : nums) System.out.print(i + "\t");

    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length; // Modular division by length of array to avoid multiple iterations
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int i, int j) {
        // Create a function to reverse array
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        // Create a function to swap array elements
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
