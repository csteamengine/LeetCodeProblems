package Medium.BSTDepth;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int maxDepth(TreeNode root){
        //returns max depth of tree.
        if(root == null){
            return 0;
        }

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
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

    @Test
    void test1() {
        TreeNode root = new TreeNode(5);
        TreeNode first = new TreeNode(4);
        TreeNode second = new TreeNode(7);
        TreeNode third = new TreeNode(2);
        TreeNode fourth = new TreeNode(6);
        TreeNode fifth = new TreeNode(8);
        TreeNode sixth = new TreeNode(1);
        TreeNode seventh = new TreeNode(3);

        root.left = first;
        root.right = second;

        first.left = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
        third.right = seventh;

        int exp = 3;

        assertEquals(exp, maxDepth(root));
    }
}
