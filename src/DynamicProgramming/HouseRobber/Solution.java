package DynamicProgramming.HouseRobber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {
    public int rob(int[] nums) {
        int rob1 = 0, rob2 = 0;
        for(int i =0; i< nums.length; i++){
            int temp = Math.max(nums[i] + rob1, rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        return rob2;
    }

    @Test
    void test1() {
        int expected = 4;
        int[] input = {1,2,3,1};
        assertEquals(expected, rob(input));
    }

    @Test
    void test2() {
        int expected = 12;
        int[] input = {2,7,9,3,1};
        assertEquals(expected, rob(input));
    }
}
