package com.leetcode.commons;

public class TreeNode implements Cloneable {

    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(){}
    public TreeNode(int val) {
         this.val = val;
    }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
