package SortArrayByParity;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class Solution {
    @Test
    void main() {
        int[] input = {3,1,2,4};
        int[] expected = {4,2,1,3};
        int[] output = sortArrayByParity(input);

        assertArrayEquals(expected, output);
    }

    public int[] sortArrayByParity(int[] A) {
        int left = 0;
        int right = A.length-1;

        while(left < right){
            if(A[left]%2 == 1 && A[right]%2 ==0){
                //swap
                int temp = A[left];
                A[left] = A[right];
                A[right] = temp;

                left++;
                right--;
            }

            if(A[left]%2 == 0){
                left++;
            }

            if(A[right]%2 == 1){
                right--;
            }
        }

        return A;
    }

//    public int[] sortArrayByParity(int[] A) {
//        int[] result = new int[A.length];
//        int even = 0;
//        int odd = A.length-1;
//
//
//        for(int curr: A){
//            if(curr%2 == 0){
//                result[even] = curr;
//                even++;
//            }else{
//                result[odd] = curr;
//                odd--;
//            }
//        }
//        return result;
//    }
}
