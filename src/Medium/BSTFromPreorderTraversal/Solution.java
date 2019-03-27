package Medium.BSTFromPreorderTraversal;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    @Test
    void main() {
        int[] order = {8,5,1,7,10,12};
        TreeNode root = bstFromPreorder(order);

        int[] array = treeToArray(root);

        assertArrayEquals(order, array);
    }

    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        for(int curr = 1; curr < preorder.length; curr++){
            insertIntoBST(root, preorder[curr]);
        }

        return root;
    }

    public TreeNode insertIntoBST(TreeNode root, int val){
        if(root == null){
            return new TreeNode(val);
        }

        if(val < root.val){
            root.left = insertIntoBST(root.left, val);
        }else{
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }

    public int[] treeToArray(TreeNode root){
        ArrayList<Integer> list = new ArrayList<>();
        if(root != null){
            list.add(root.val);
            int[] left = treeToArray(root.left);
            int[] right = treeToArray(root.right);
            for(int curr: left){
                list.add(curr);
            }
            for(int curr: right){
                list.add(curr);
            }
        }

        int[] toReturn = new int[list.size()];
        for(int i = 0; i<list.size(); i++){
            toReturn[i] = list.get(i);
        }
        return toReturn;
    }
}
