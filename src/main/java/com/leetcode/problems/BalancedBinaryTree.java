package com.leetcode.problems;

import com.leetcode.commons.TreeNode;

public class BalancedBinaryTree {

    /**
     * LeetCode-110 BalancedBinaryTree
     * Time Complexity : O(n), Time Complexity
     * Space Complexity : O(n), Space Complexity if the tree is skewed
     */
    public boolean isBalanced(TreeNode root) {
        if(root == null)  return true;
        if(heightOfBalanceNode(root) == -1) return false;
        return true;
    }

    private int heightOfBalanceNode(TreeNode root) {
        if(root == null) return 0;
        int leftHeight = heightOfBalanceNode(root.left);
        int rightHeight = heightOfBalanceNode(root.right);
        if(leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight -rightHeight) > 1) return -1;
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
