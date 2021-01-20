package Arrays.PlusOne;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {
    public int[] plusOne(int[] digits) {
        boolean shifted = false;
        int index = digits.length-1;
        while(index >= 0){
            if(digits[index] < 9){
                digits[index] = digits[index] + 1;
                shifted = false;
                break;
            }
            shifted = true;
            digits[index] = 0;

            index--;
        }

        if(shifted){
            //copy array adding 1 at beginning
            int[] output = new int[digits.length+1];
            output[0] = 1;
            System.arraycopy(digits, 0, output, 1, digits.length - 1);
            digits = output;
        }

        return digits;
    }

    @Test
    void testPlusOne() {
        int[] test1 = {1,2,3};
        int[] expected = {1,2,4};

        assertArrayEquals(expected, plusOne(test1));

    }

    @Test
    void testPlusOneFourDigits() {
        int[] test1 = {4,3,2,1};
        int[] expected = {4,3,2,2};

        assertArrayEquals(expected, plusOne(test1));

    }

    @Test
    void testPlusOneZero() {
        int[] test1 = {0};
        int[] expected = {1};

        assertArrayEquals(expected, plusOne(test1));

    }

    @Test
    void testPlusOneAllNines() {
        int[] test1 = {9,9,9};
        int[] expected = {1, 0, 0, 0};

        assertArrayEquals(expected, plusOne(test1));

    }

    @Test
    void testPlusOneSomeNines() {
        int[] test1 = {8,9,9,9};
        int[] expected = {9, 0, 0, 0};

        assertArrayEquals(expected, plusOne(test1));

    }

    @Test
    void testPlusOneZeroes() {
        int[] test1 = {0,0};
        int[] expected = {0,1};

        assertArrayEquals(expected, plusOne(test1));

    }
}
