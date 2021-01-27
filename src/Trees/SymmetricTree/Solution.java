package Trees.SymmetricTree;

import org.junit.jupiter.api.Test;
import sun.reflect.generics.tree.Tree;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
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

class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    public boolean isMirror(TreeNode left, TreeNode right){
        if(left == null && right == null) return true;
        if(left == null || right == null) return false;
        return (left.val == right.val)
                && isMirror(left.right, right.left)
                && isMirror(left.left, right.right);
    }

    @Test
    void testSymmetry1() {
        TreeNode leftThree = new TreeNode(3, null, null);
        TreeNode leftFour = new TreeNode(4, null, null);
        TreeNode rightThree = new TreeNode(3, null, null);
        TreeNode rightFour = new TreeNode(4, null, null);
        TreeNode leftTwo = new TreeNode(2, leftThree, leftFour);
        TreeNode rightTwo = new TreeNode(2, rightFour, rightThree);
        TreeNode one = new TreeNode(1, leftTwo, rightTwo);

        assertTrue(isSymmetric(one));
    }

    @Test
    void testSymmetry2() {
        TreeNode leftThree = new TreeNode(3, null, null);
//        TreeNode leftFour = new TreeNode(3, null, null);
        TreeNode rightThree = new TreeNode(3, null, null);
//        TreeNode rightFour = new TreeNode(3, null, null);
        TreeNode leftTwo = new TreeNode(2, leftThree, null);
        TreeNode rightTwo = new TreeNode(2, null, rightThree);
        TreeNode one = new TreeNode(1, leftTwo, rightTwo);

        assertFalse(isSymmetric(one));
    }
}