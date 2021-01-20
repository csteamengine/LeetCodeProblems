package BSTToGST;

import org.junit.jupiter.api.Test;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {
    int sum = 0;
    public TreeNode bstToGst(TreeNode root) {
        if(root == null) return node;
        bstToGst(root.right);
        sum += root.val;
        root.val = sum;
        bstToGst(root.left);
        return root;
    }



    @Test
    void testClimbStairs() {
    }
}
