package SumOfNodesEvenGrandparent;

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
    public int sumEvenGrandparent(TreeNode root) {

        return sumEvenGrandparentExtended(root, null, null);
    }

    public int sumEvenGrandparentExtended(TreeNode root, TreeNode parent, TreeNode grandparent){

        int output = 0;
        if(root.left != null){
            output += sumEvenGrandparentExtended(root.left, root, parent);
        }

        if(root.right != null){
            output += sumEvenGrandparentExtended(root.right, root, parent);
        }

        if(grandparent != null && grandparent.val % 2 == 0){
            output += root.val;
        }

        return output;
    }

    @Test
    void testSumEvenGrandparent() {

    }
}
