package Medium.MaximumBinaryTree;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

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
        int[] input = {3,2,1,6,0,5};

        TreeNode root = constructMaximumBinaryTree(input);
        printTree(root);
        assertEquals(root.val, 6);
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int index = 0;
        int max = nums[index];

        if(nums.length == 1){
            return new TreeNode(nums[0]);
        }

        for(int i = 0; i<nums.length; i++) {
            if (nums[i] > max){
                max = nums[i];
                index = i;
            }
        }

        TreeNode root = new TreeNode(max);
        //get left subarray
        //get right subarray
        if(index > 0){
            int[] left = Arrays.copyOfRange(nums, 0, index);
            root.left = constructMaximumBinaryTree(left);
        }
        if(index < nums.length-1){
            int[] right = Arrays.copyOfRange(nums, index+1, nums.length);
            root.right = constructMaximumBinaryTree(right);
        }

        return root;
    }

    public void printTree(TreeNode root){
        if(root != null){
            System.out.println(root.val);
            printTree(root.left);
            printTree(root.right);
        }
    }
}
