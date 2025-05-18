package com.leetcode.problems;

import com.leetcode.commons.TreeNode;

public class InvertBinaryTree {

    /**
     * LeetCode-125 InvertBinaryTree
     * Time Complexity : O(n), Time Complexity
     * Space Complexity : O(1), Space Complexity
     */
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return root;
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
