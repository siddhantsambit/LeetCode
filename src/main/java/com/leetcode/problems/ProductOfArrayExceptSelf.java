package com.leetcode.problems;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    /*
     * LeetCode-238 ProductOfArrayExceptSelf
     * Time Complexity : O(n), n is length of input array
     * Space Complexity : O(n)
     */

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4};
        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
        System.out.println(Arrays.toString(productOfArrayExceptSelf.productExceptSelf(nums)));

        nums = new int[]{-1, 1, 0, -3, 3};
        System.out.println(Arrays.toString(productOfArrayExceptSelf.productExceptSelf(nums)));
    }

    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        int prefixProduct = 1, suffixProduct = 1;
        for (int i = 0; i < nums.length; i++) {
            ans[i] = prefixProduct;
            prefixProduct *= nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }
        return ans;
    }
}
