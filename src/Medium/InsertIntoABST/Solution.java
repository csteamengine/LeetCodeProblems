package Medium.InsertIntoABST;

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
        TreeNode root = insertIntoBST(null, 4);
        insertIntoBST(root, 2);
        insertIntoBST(root, 7);
        insertIntoBST(root, 1);
        insertIntoBST(root, 3);

        printTree(root);

        System.out.println();
        root = insertIntoBST(root, 5);

        printTree(root);

    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
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

    public void printTree(TreeNode root){
        if(root != null){
            System.out.println(root.val);
            printTree(root.left);
            printTree(root.right);
        }
    }
}
