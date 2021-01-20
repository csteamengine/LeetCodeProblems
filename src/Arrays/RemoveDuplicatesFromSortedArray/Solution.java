package Arrays.RemoveDuplicatesFromSortedArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        for(int j = 1; j < nums.length; j++){
            if(nums[j] != nums[index]){
                index++;
                nums[index] = nums[j];
            }
        }
        for(int i = 0; i< index+1; i++){
            System.out.println(nums[i]);
        }
        return index+1;
    }

    @Test
    void testAddTwoNumbers() {
        int[] nums1 = {1,1,2};

        assertEquals(2, removeDuplicates(nums1));
//        for(int i = 0; i< nums1.length; i++){
//            System.out.println(nums1[i]);
//        }

    }
}
