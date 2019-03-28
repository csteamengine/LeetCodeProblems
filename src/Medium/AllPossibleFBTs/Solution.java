package Medium.AllPossibleFBTs;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

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
        int input = 7;
        int expected = 5;

        List<TreeNode> result = allPossibleFBT(input);
        for(TreeNode tree :result){
            System.out.println(Arrays.toString(treeToArray(tree)));
        }
    }

    public List<TreeNode> allPossibleFBT(int N) {
        ArrayList<TreeNode> tree = new ArrayList<>();

        //Base Case
        if(N == 1){
            tree.add(new TreeNode(0));
        }else{
            N--;

            for(int i = 1; i< N; i+=2){
                List<TreeNode> left = allPossibleFBT(i);
                List<TreeNode> right = allPossibleFBT(N-i);
                for(TreeNode nl: left){
                    for(TreeNode nr:right){
                        TreeNode cur = new TreeNode(0);
                        cur.left=nl;
                        cur.right=nr;
                        tree.add(cur);
                    }
                }
            }
        }
        return tree;
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
}
