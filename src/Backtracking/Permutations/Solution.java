package Backtracking.Permutations;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        return recursePermute(nums, 0, new ArrayList<Integer>(), result);
    }

    public List<List<Integer>> recursePermute(int[] nums, int start, List<Integer> currList, List<List<Integer>> result){
        if(currList.size() == nums.length){
            result.add(currList);
            return result;
        }

        for(int i = 0; i <= currList.size(); i++ ){
            ArrayList<Integer> newList = new ArrayList<>(currList);
            newList.add(i, nums[start]);
            recursePermute(nums, start+1, newList, result);
        }

        return result;
    }
}