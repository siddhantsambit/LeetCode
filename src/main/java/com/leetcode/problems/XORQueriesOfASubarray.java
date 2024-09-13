package com.leetcode.problems;

import java.util.Arrays;

public class XORQueriesOfASubarray {

    /*
    * LeetCode-1310 XORQueriesOfASubarray
    * Time Complexity : O(n), n is the size of the array
    * Space Complexity : O(n)
    */
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 8};
        int queries[][] = {{0, 1}, {1, 2}, {0, 3}, {3, 3}};
        XORQueriesOfASubarray xorQueriesOfASubarray = new XORQueriesOfASubarray();
        System.out.println(Arrays.toString(xorQueriesOfASubarray.xorQueries(arr, queries)));
        arr = new int[]{4, 8, 2, 10};
        queries = new int[][]{{2,3}, {1,3}, {0,0}, {0,3}};
        System.out.println(Arrays.toString(xorQueriesOfASubarray.xorQueries(arr, queries)));
    }

    public int[] xorQueries(int[] arr, int[][] queries) {
        int pre[] = new int[arr.length];
        pre[0] = arr[0];
        for(int i=1; i< arr.length; i++) {
            pre[i] = pre[i-1] ^ arr[i];
        }
        int res[] = new int[queries.length];
        for(int i=0; i < queries.length; i++) {
            int m = queries[i][0];
            int n = queries[i][1];
            res[i] = (m==0) ? pre[n] : pre[n] ^ pre[m-1];
        }
        return res;
    }
}
