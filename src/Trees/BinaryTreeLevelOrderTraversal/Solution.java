package Trees.BinaryTreeLevelOrderTraversal;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
    public List<List<Integer>> levelOrder(TreeNode root)
    {
        List<List<Integer>> output = new ArrayList<>();
        levelOrderHelper(root, output, 0);

        return output;
    }

    private void levelOrderHelper(TreeNode node, List<List<Integer>> list, int depth)
    {
        if (node == null) return;

        if (depth == list.size())
        {
            list.add(new ArrayList<>());
        }
        list.get(depth).add(node.val);
        levelOrderHelper(node.left, list, depth + 1);
        levelOrderHelper(node.right, list, depth + 1);
    }

    @Test
    void testLevelOrder() {
        TreeNode one = new TreeNode(1, null, null);
        TreeNode three = new TreeNode(3, null, null);
        TreeNode two = new TreeNode(2, one, three);

        assertTrue(isValidBST(two));

    }
}