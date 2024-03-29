package com.jamison.jianzhi_offer2;

public class MirrorTree {
    public TreeNode mirrorTree(TreeNode root) {
        if(root == null) {
            return null;
        }
        TreeNode tmp = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(tmp);
        return root;
    }
}
