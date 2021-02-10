package Mock4.Question1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length <= 1) return 0;

        for(int i = 0; i < nums.length; i++){
            boolean left = false;
            boolean right = false;
            if(i == 0 || nums[i] > nums[i-1]){
                left = true;
            }
            if(i == nums.length-1 || nums[i] > nums[i+1]){
                right = true;
            }
            if(right && left){
                return i;
            }
        }

        return 0;
    }

    @Test
    void test1() {
        int[] input = {1,2,3,1};
        int exp = 2;

        assertEquals(exp, findPeakElement(input));
    }

    @Test
    void test2() {
        int[] input = {1,2,1,3,5,6,4};
        int exp = 1;

        assertEquals(exp, findPeakElement(input));
    }

    @Test
    void test3() {
        int[] input = {1,1,1,1,1,1,1};
        int exp = 0;

        assertEquals(exp, findPeakElement(input));
    }

    @Test
    void test4() {
        int[] input = {1,2};
        int exp = 1;

        assertEquals(exp, findPeakElement(input));
    }
}
