package Arrays.TwoSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int creeper = 0;
        int runner = 1;
        int[] output = new int[2];

        while(creeper < nums.length && runner < nums.length){
            if(nums[creeper] + nums[runner] == target){
                output[0] = creeper;
                output[1] = runner;
                break;
            }

            runner++;

            if(runner == nums.length){
                creeper++;
                runner = creeper+1;
            }

        }
        return output;
    }

    @Test
    void twoSum1() {
        int[] test1 = {2,7,11,15};
        int target = 9;
        int[] expected = {0,1};

        assertArrayEquals(expected, twoSum(test1, target));

    }

    @Test
    void twoSum2() {
        int[] test1 = {3,2,4};
        int target = 6;
        int[] expected = {1,2};

        assertArrayEquals(expected, twoSum(test1, target));

    }

    @Test
    void twoSum3() {
        int[] test1 = {3,3};
        int target = 6;
        int[] expected = {0,1};

        assertArrayEquals(expected, twoSum(test1, target));

    }

    @Test
    void twoSum4() {
        int[] test1 = {9, 0, 3};
        int target = 9;
        int[] expected = {0,1};

        assertArrayEquals(expected, twoSum(test1, target));
    }

    @Test
    void twoNegative() {
        int[] test1 = {-1,-2,-3,-4,-5};
        int target = -8;
        int[] expected = {2,4};

        assertArrayEquals(expected, twoSum(test1, target));
    }
}

