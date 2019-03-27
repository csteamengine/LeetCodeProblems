package Medium.RangeSumOfBST;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    @Test
    void main() {
        TreeNode root = new TreeNode(10);
        System.out.println(root.left);
    }
    public int rangeSumBST(TreeNode root, int L, int R) {
        int value = 0;
        if(root == null){
            return 0;
        }

        if(root.val >= L && root.val <= R){
            value += root.val;
        }
        value += rangeSumBST(root.left, L, R);
        value += rangeSumBST(root.right, L, R);

        return value;
    }
}
