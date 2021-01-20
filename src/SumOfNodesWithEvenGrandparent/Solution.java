package SumOfNodesWithEvenGrandparent;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {
    public static class TreeNode {
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
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);
        TreeNode eight = new TreeNode(8);
        TreeNode two = new TreeNode(2);
        TreeNode seven2 = new TreeNode(7);
        TreeNode one = new TreeNode(1);
        TreeNode three = new TreeNode(3);
        TreeNode nine = new TreeNode(9);
        TreeNode one2 = new TreeNode(1);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        six.left = seven;
        six.right = eight;
        seven.left = two;
        seven.right = seven2;
        eight.left = one;
        eight.right = three;
        two.left = nine;
        seven2.left = one2;
        seven2.right = four;
        three.right = five;

        assertEquals(18, sumEvenGrandparent(six));
    }
}
