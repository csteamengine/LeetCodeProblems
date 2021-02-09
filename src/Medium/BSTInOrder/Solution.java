package Medium.BSTInOrder;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> output = new ArrayList<>();
        return inOrderHelper(root, output);
    }

    public List<Integer> inOrderHelper(TreeNode root, List<Integer> arrList){
        if(root == null){
            return arrList;
        }

        inOrderHelper(root.left, arrList);
        arrList.add(root.val);
        inOrderHelper(root.right, arrList);
        return arrList;
    }

    @Test
    void testPermute() {
    }
}
