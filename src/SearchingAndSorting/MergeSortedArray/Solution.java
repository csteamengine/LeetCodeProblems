package SearchingAndSorting.MergeSortedArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int num1Index = m - 1;
        int num2Index = n - 1;
        int index = m + n - 1;
        while(num1Index >= 0 && num2Index >= 0){
            if(nums1[num1Index] >= nums2[num2Index]){
                nums1[index] = nums1[num1Index];
                num1Index--;
            }else{
                nums1[index] = nums2[num2Index];
                num2Index--;
            }
            index--;
        }

        while(num2Index >= 0){
            nums1[index--] = nums2[num2Index--];
        }
    }

    public void printArray(int[] array){
        for(int i = 0; i< array.length; i++){
            System.out.print(array[i]);
            System.out.print(',');
        }
        System.out.println();
    }

    @Test
    void testArray1() {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2, 5, 6};
        int[] expected = {1, 2, 2, 3, 5, 6};

        merge(nums1, 3, nums2, 3);

        printArray(nums1);
        assertArrayEquals(expected, nums1);
    }

    @Test
    void testArray2() {
        int[] nums1 = {2,0};
        int[] nums2 = {1};
        int[] expected = {1, 2};

        merge(nums1, 1, nums2, 1);

        printArray(nums1);
        assertArrayEquals(expected, nums1);
    }
}
