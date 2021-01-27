package Trees.ConvertSortedArrayToBST;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;
        int middle = nums[nums.length/2];
        TreeNode output = new TreeNode(middle);
        output.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, (nums.length/2)));
        output.right = sortedArrayToBST(Arrays.copyOfRange(nums, (nums.length/2)+1, nums.length));
        return output;
    }

    @Test
    void testArray1() {

    }

    @Test
    void testArray2() {

    }
}