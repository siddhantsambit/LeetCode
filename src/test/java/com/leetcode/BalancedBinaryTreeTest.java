package com.leetcode;

import com.leetcode.commons.TreeNode;
import com.leetcode.problems.BalancedBinaryTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BalancedBinaryTreeTest {

    private BalancedBinaryTree balancedBinaryTree;

    @BeforeEach
    public void setUp() {
        balancedBinaryTree = new BalancedBinaryTree();
    }

    @Test
    public void test1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        Assertions.assertTrue(balancedBinaryTree.isBalanced(root));
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(4);
        Assertions.assertFalse(balancedBinaryTree.isBalanced(root));
    }

    @Test
    public void test3() {
        TreeNode root = null;
        Assertions.assertTrue(balancedBinaryTree.isBalanced(root));
    }
}
