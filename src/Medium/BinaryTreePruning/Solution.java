package Medium.BinaryTreePruning;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class Solution {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    @Test
    void main() {
//        pruneTree(new TreeNode);
    }

    public TreeNode pruneTree(TreeNode root) {
        if(root == null){
            return null;
        }

        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);

        if(root.left == null && root.right == null && root.val == 0){
            return null;
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
