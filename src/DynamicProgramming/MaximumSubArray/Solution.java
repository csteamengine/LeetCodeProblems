package DynamicProgramming.MaximumSubArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {
    public int maxSubArray(int[] nums) {
        int maxSub = nums[0], curSum = 0;

        for (int n : nums) {
            if (curSum < 0)
                curSum = 0;
            curSum += n;
            maxSub = Math.max(maxSub, curSum);
        }
        return maxSub;
    }

    @Test
    void test1() {
        int expected = 6;
        int[] input = {-2,1,-3,4,-1,2,1,-5,4};
        assertEquals(expected, maxSubArray(input));
    }

    @Test
    void test2() {
        int expected = 1;
        int[] input = {1};
        assertEquals(expected, maxSubArray(input));
    }

    @Test
    void test3() {
        int expected = 0;
        int[] input = {0};
        assertEquals(expected, maxSubArray(input));
    }

    @Test
    void test4() {
        int expected = -1;
        int[] input = {-1};
        assertEquals(expected, maxSubArray(input));
    }

    @Test
    void test5() {
        int expected = -10000;
        int[] input = {-10000};
        assertEquals(expected, maxSubArray(input));
    }
}
