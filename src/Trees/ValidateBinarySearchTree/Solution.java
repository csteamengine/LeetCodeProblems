package Trees.ValidateBinarySearchTree;

import org.junit.jupiter.api.Test;

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
    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }

    public boolean validate(TreeNode root, Integer min, Integer max){
        if(root == null){
            return true;
        }

        if((min != null && root.val < min) || (max != null && root.val > max)){
            return false;
        }

        return validate(root.left, min, root.val) && validate(root.right, root.val, max);
    }

    @Test
    void testBSTDepth1() {
        TreeNode one = new TreeNode(1, null, null);
        TreeNode three = new TreeNode(3, null, null);
        TreeNode two = new TreeNode(2, one, three);

        assertTrue(isValidBST(two));

    }

    @Test
    void testBSTDepth2() {
        TreeNode three = new TreeNode(3, null, null);
        TreeNode six = new TreeNode(6, null, null);
        TreeNode four = new TreeNode(4,three, six);
        TreeNode one = new TreeNode(1, null, null);
        TreeNode five = new TreeNode(5, one, four);

        assertFalse(isValidBST(five));

    }

    @Test
    void testBSTDepth3() {
        TreeNode three = new TreeNode(3, null, null);
        TreeNode seven = new TreeNode(7, null, null);
        TreeNode six = new TreeNode(6,three, seven);
        TreeNode four = new TreeNode(4, null, null);
        TreeNode five = new TreeNode(5, four, six);

        assertFalse(isValidBST(five));

    }
}