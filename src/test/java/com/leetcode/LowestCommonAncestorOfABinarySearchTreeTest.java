package com.leetcode;

import com.leetcode.commons.TreeNode;
import com.leetcode.problems.LowestCommonAncestorOfABinarySearchTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LowestCommonAncestorOfABinarySearchTreeTest {

    private LowestCommonAncestorOfABinarySearchTree lowestCommonAncestorOfABinarySearchTree;

    private TreeNode root1;

    private TreeNode root2;

    private TreeNode root3;

    @BeforeEach
    public void setUp() {
        lowestCommonAncestorOfABinarySearchTree = new LowestCommonAncestorOfABinarySearchTree();
        // Input Test Case 1
        root1 = new TreeNode(6);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(8);
        root1.left.left = new TreeNode(0);
        root1.left.right = new TreeNode(4);
        root1.left.right.left = new TreeNode(3);
        root1.left.right.right = new TreeNode(5);
        // Input Test Case 2
        root2 = new TreeNode(6);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(8);
        root2.left.left = new TreeNode(0);
        root2.left.right = new TreeNode(4);
        root2.left.right.left = new TreeNode(3);
        root2.left.right.right = new TreeNode(5);
        // Input Test Case 3
        root3 = new TreeNode(2);
        root3.left = new TreeNode(1);
    }

    @Test
    public void solution1_Test1() {
        TreeNode output = lowestCommonAncestorOfABinarySearchTree.lowestCommonAncestorSolution1(root1, new TreeNode(2), new TreeNode(8));
        Assertions.assertEquals(6, output.val);
    }

    @Test
    public void solution1_Test2() {
        TreeNode output = lowestCommonAncestorOfABinarySearchTree.lowestCommonAncestorSolution1(root2, new TreeNode(2), new TreeNode(4));
        Assertions.assertEquals(2, output.val);
    }

    @Test
    public void solution1_Test3() {
        TreeNode output = lowestCommonAncestorOfABinarySearchTree.lowestCommonAncestorSolution1(root3, new TreeNode(2), new TreeNode(1));
        Assertions.assertEquals(2, output.val);
    }

    @Test
    public void solution2_Test1() {
        TreeNode output = lowestCommonAncestorOfABinarySearchTree.lowestCommonAncestorSolution2(root1, new TreeNode(2), new TreeNode(8));
        Assertions.assertEquals(6, output.val);
    }

    @Test
    public void solution2_Test2() {
        TreeNode output = lowestCommonAncestorOfABinarySearchTree.lowestCommonAncestorSolution2(root2, new TreeNode(2), new TreeNode(4));
        Assertions.assertEquals(2, output.val);
    }

    @Test
    public void solution2_Test3() {
        TreeNode output = lowestCommonAncestorOfABinarySearchTree.lowestCommonAncestorSolution2(root3, new TreeNode(2), new TreeNode(1));
        Assertions.assertEquals(2, output.val);
    }
}

