package Mock1.Question1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int crawler = 0;
        int sprinter = 0;
        while(sprinter < nums.length){
            System.out.println(crawler);
            if(nums[crawler] != val){
                crawler++;
            }else if(nums[sprinter] != val){
                nums[crawler] = nums[sprinter];
                nums[sprinter] = val;
                crawler++;
            }
            sprinter++;
        }

        return crawler;
    }

    @Test
    void testRemove() {
        int[] input = {3,2,2,3};
        int exp = 2;

        assertEquals(exp, removeElement(input, 3));
    }

    @Test
    void testRemove1() {
        int[] input = {2};
        int exp = 1;

        assertEquals(exp, removeElement(input, 3));
    }
}
