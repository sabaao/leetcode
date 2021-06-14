package org.example;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return false;
        if(root.left==null && root.right==null) return true;
        if(root.left==null || root.right==null) return false;

        return isSymmetric(root.left,root.right);
    }

    private boolean isSymmetric(TreeNode left, TreeNode right){
        if(left==null && right==null) return true;

        if(left==null || right==null) return false;

        if(left.val==right.val){
            return isSymmetric(left.left,right.right) && isSymmetric(left.right,right.left);
        }else {
            return false;
        }
    }
}
