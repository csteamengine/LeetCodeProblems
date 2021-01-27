package Trees.MaximumDepthOfBinaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
    public int maxDepth(TreeNode root) {
        int left = 0;
        int right = 0;
        int output = 1;

        if(root == null){
            return 0;
        }

        left = maxDepth(root.left);
        right = maxDepth(root.right);

        output += Math.max(left, right);

        return output;
    }

    @Test
    void testBSTDepth1() {
        TreeNode fifteen = new TreeNode(15, null, null);
        TreeNode seven = new TreeNode(7, null, null);
        TreeNode twenty = new TreeNode(20, fifteen, seven);
        TreeNode nine = new TreeNode(9, null, null);
        TreeNode three = new TreeNode(3, nine, twenty);

        int expected = 3;

        assertEquals(expected, maxDepth(three));

    }
}