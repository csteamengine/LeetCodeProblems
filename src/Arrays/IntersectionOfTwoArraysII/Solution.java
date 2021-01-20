package Arrays.IntersectionOfTwoArraysII;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> outputList = new ArrayList<Integer>();

        int index = 0;
        int secondInd = 0;
        while(index < nums1.length && secondInd < nums2.length){
            //If the same, increase both
            //If not the same, increase lower one
            if(nums1[index] == nums2[secondInd]){
                //add to array list
                outputList.add(nums1[index]);
                secondInd++;
                index++;
            }else if(nums1[index] < nums2[secondInd]){
                index++;
            }else{
                secondInd++;
            }
        }
        int[] output = new int[outputList.size()];
        for(int i = 0; i<output.length; i++){
            output[i] = outputList.get(i);
            System.out.println(output[i]);
        }
        return output;
    }

    @Test
    void testIntersection() {
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};
        int[] expected = {2,2};

        assertArrayEquals(expected, intersect(arr1, arr2));
    }

    @Test
    void testIntersection2() {
        int[] arr1 = {4,9,5};
        int[] arr2 = {9,4,9,8,4};
        int[] expected = {4,9};

        assertArrayEquals(expected, intersect(arr1, arr2));
    }

    @Test
    void testIntersection3() {
        int[] arr1 = {4,4,9,5};
        int[] arr2 = {9,4,9,8,4};
        int[] expected = {4,4,9};

        assertArrayEquals(expected, intersect(arr1, arr2));
    }
}
