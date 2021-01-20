package Arrays.RotateArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {
    public void rotate(int[] nums, int k) {
        for(int rounds = 0; rounds < k; rounds ++){
            int temp = nums[nums.length-1];
            for(int index = nums.length-1; index >0; index--){
                nums[index] = nums[index-1];
            }
            nums[0] = temp;
        }
    }

    @Test
    void testRotateArray() {
        int[] test1 = {1,2,3,4,5,6,7};

        rotate(test1, 1);
        for (int j : test1) {
            System.out.println(j);
        }

    }

}
