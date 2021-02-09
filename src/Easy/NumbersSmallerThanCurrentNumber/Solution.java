package Easy.NumbersSmallerThanCurrentNumber;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        //Sort array
        //
        int[] output = new int[nums.length];
        for(int i = 0; i< nums.length; i++){
            int counter = 0;
            for(int j = 0; j<nums.length; j++){
                if(nums[j] < nums[i]){
                    counter++;
                }
            }
            output[i] = counter;
        }
        return output;
    }

    @Test
    void testSmallerNums() {
        int[] input = {8,1,2,2,3};
        int[] expected = {4,0,1,1,3};

        assertArrayEquals(expected, smallerNumbersThanCurrent(input));
    }

    @Test
    void testSmallerNums2() {
        int[] input = {6,5,4,8};
        int[] expected = {2,1,0,3};

        assertArrayEquals(expected, smallerNumbersThanCurrent(input));
    }

    @Test
    void testSmallerNums3() {
        int[] input = {7,7,7,7};
        int[] expected = {0,0,0,0};

        assertArrayEquals(expected, smallerNumbersThanCurrent(input));
    }
}
