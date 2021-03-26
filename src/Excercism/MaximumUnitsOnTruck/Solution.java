package Excercism.MaximumUnitsOnTruck;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        //TODO sort the array
        mergeSort(boxTypes, 0, boxTypes.length-1);

        for (int[] ints : boxTypes) {
            for (int j = 0; j < boxTypes[0].length; j++) {
                System.out.print(ints[j]);
                if(j == 0){
                    System.out.print(" : ");
                }
            }
            System.out.println();
        }

        int boxCount = truckSize;
        int output = 0;
        int index = 0;

        while(boxCount > 0){
            if(boxTypes[index][0] > 0){
                output += boxTypes[index][1];
                boxTypes[index][0]--;
                boxCount--;
            }else{
                index++;
            }
        }

        return output;
    }


    public static void mergeSort(int[][] array, int left, int right) {
        if (right <= left) return;
        int mid = (left+right)/2;
        mergeSort(array, left, mid);
        mergeSort(array, mid+1, right);
        merge(array, left, mid, right);
    }

    static void merge(int[][] array, int left, int mid, int right) {
        // calculating lengths
        int lengthLeft = mid - left + 1;
        int lengthRight = right - mid;

        // creating temporary subarrays
        int leftArray[][] = new int [lengthLeft][2];
        int rightArray[][] = new int [lengthRight][2];

        // copying our sorted subarrays into temporaries
        for (int i = 0; i < lengthLeft; i++)
            leftArray[i] = array[left+i];
        for (int i = 0; i < lengthRight; i++)
            rightArray[i] = array[mid+i+1];

        // iterators containing current index of temp subarrays
        int leftIndex = 0;
        int rightIndex = 0;

        // copying from leftArray and rightArray back into array
        for (int i = left; i < right + 1; i++) {
            // if there are still uncopied elements in R and L, copy minimum of the two
            if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                if (leftArray[leftIndex][1] > rightArray[rightIndex][1]) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                }
                else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            }
            // if all the elements have been copied from rightArray, copy the rest of leftArray
            else if (leftIndex < lengthLeft) {
                array[i] = leftArray[leftIndex];
                leftIndex++;
            }
            // if all the elements have been copied from leftArray, copy the rest of rightArray
            else if (rightIndex < lengthRight) {
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }


    @Test
    void test1() {
        int[][] input = {{5,10},{2,5},{4,7},{3,9}};
        int truckSize = 10;
        int expect = 91;

        assertEquals(expect, maximumUnits(input, truckSize));
//        ListNode
//        addTwoNumbers()
    }
}
