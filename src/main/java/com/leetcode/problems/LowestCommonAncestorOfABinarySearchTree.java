package com.leetcode.problems;

import com.leetcode.commons.TreeNode;

public class LowestCommonAncestorOfABinarySearchTree {

    /**
     * LeetCode-235 AddingSpacesToAString
     * Time Complexity : O(h), height of the BST
     * Space Complexity : O(1), Constant Space
     */
    public TreeNode lowestCommonAncestorSolution1(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            if(p.val > root.val && q.val > root.val) root = root.right;
            else if (p.val < root.val && q.val < root.val) root = root.left;
            else return root;
        }
        return root;
    }

    public TreeNode lowestCommonAncestorSolution2(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            if(Math.min(p.val, q.val) > root.val) root = root.right;
            else if (Math.max(p.val, q.val) < root.val) root = root.left;
            else return root;
        }
        return root;
    }
}
