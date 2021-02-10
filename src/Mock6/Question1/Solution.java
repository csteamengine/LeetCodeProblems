package Mock6.Question1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sprinter = 0, crawler = 0;
        int[] output = new int[2];

        while(crawler < nums.length){
            sprinter = crawler+1;
            while(sprinter < nums.length){
                if(nums[crawler] + nums[sprinter] == target){
                    output[0] = crawler;
                    output[1] = sprinter;
                    return output;
                }
                sprinter++;
            }
            crawler++;
        }
        return output;
    }

    @Test
    void test1() {
        int[] input = {3,2,4};
        int target = 6;
        int[] exp = {1,2};

        assertArrayEquals(exp, twoSum(input, target));
    }

    @Test
    void test2() {
        int[] input = {3,3};
        int target = 6;
        int[] exp = {0,1};

        assertArrayEquals(exp, twoSum(input, target));
    }

    @Test
    void test3() {
        int[] input = {2,7,11,15};
        int target = 9;
        int[] exp = {0,1};

        assertArrayEquals(exp, twoSum(input, target));
    }
}
