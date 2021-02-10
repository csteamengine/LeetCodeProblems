package Mock5.Question2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> output;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 1; i <= nums.length; i++){
            set.add(i);
        }

        for (int num : nums) {
            set.remove(num);
        }

        output = new ArrayList<>(set);
        return output;
    }

    @Test
    void test1() {
        int[] input = {4,3,2,7,8,2,3,1};
        Integer[] exp = {5,6};
        List<Integer> actual = findDisappearedNumbers(input);

        for(int curr: actual){
            System.out.println(curr);
        }

        assertArrayEquals(exp,actual.toArray());
    }
}