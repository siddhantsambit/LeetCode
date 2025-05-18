package com.leetcode;

import com.leetcode.commons.TreeNode;
import com.leetcode.problems.InvertBinaryTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InvertBinaryTreeTest {

    private InvertBinaryTree invertBinaryTree;

    @BeforeEach
    public void setUp(){
        invertBinaryTree = new InvertBinaryTree();
    }

    @Test
    public void test1() throws CloneNotSupportedException {
        TreeNode root = new TreeNode();
        root.val = 4;
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        TreeNode inputRoot = (TreeNode) root.clone();
        inputRoot.left = (TreeNode) root.left.clone();
        inputRoot.right = (TreeNode) root.right.clone();

        root = invertBinaryTree.invertTree(root);
        Assertions.assertEquals(root.val, root.val);
        Assertions.assertEquals(inputRoot.left.val, root.right.val);
        Assertions.assertEquals(inputRoot.right.val, root.left.val);
        Assertions.assertEquals(inputRoot.left.left.val, root.right.right.val);
        Assertions.assertEquals(inputRoot.left.right.val, root.right.left.val);
        Assertions.assertEquals(inputRoot.right.left.val, root.left.right.val);
        Assertions.assertEquals(inputRoot.right.right.val, root.left.left.val);
    }

    @Test
    public void test2() throws CloneNotSupportedException {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        TreeNode inputRoot = (TreeNode) root.clone();
        root = invertBinaryTree.invertTree(root);
        Assertions.assertEquals(root.val, root.val);
        Assertions.assertEquals(inputRoot.left.val, root.right.val);
        Assertions.assertEquals(inputRoot.right.val, root.left.val);
    }
    @Test
    public void test3() {
        TreeNode root = null;
        Assertions.assertEquals(null, invertBinaryTree.invertTree(root));
    }

}
