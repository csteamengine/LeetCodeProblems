package DivideTwoIntegers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution {
    public int divide(int dividend, int divisor) {
        int remainder = dividend;
        int count = 0;
        boolean negativeRem = false;
        boolean negativeDiv = false;

        if(divisor == 1) return dividend;
        else if(divisor == -1){
            if (dividend == Integer.MIN_VALUE) return Integer.MAX_VALUE; else return -dividend;
        }

        if(remainder < 0){
            remainder *= -1;
            negativeRem = true;
        }

        if(divisor < 0){
            divisor *= -1;
            negativeDiv = true;
        }

        while(remainder >= divisor){
            remainder = remainder - divisor;
            count++;
        }

        if((negativeRem && !negativeDiv) || (negativeDiv && !negativeRem)){
            count *= -1;
        }
        return count;
    }

    @Test
    void main() {
        int answer = divide(10, 3);
        int answer2 = divide(-2147483648, -1);
        int expected = 3;
        int expected2 = 2147483647;

        assertEquals(expected, answer);
        assertEquals(expected2, answer2);
    }
}