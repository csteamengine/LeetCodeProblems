package Math.PowerOfThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Solution {
    public boolean isPowerOfThree(int n) {
        int num = n;

        if(n == 1) return true;

        if(n < 3) return false;

        while(num > 3){
            if(num % 3 == 0){
                num /= 3;
            }else{
                return false;
            }
        }

        if(num < 3){
            return false;
        }
        return true;
    }

    @Test
    void testPowerOfThree() {
        int input = 27;
        assertTrue(isPowerOfThree(input));
    }

    @Test
    void testPowerOfThree2() {
        int input = 0;
        assertFalse(isPowerOfThree(input));
    }

    @Test
    void testPowerOfThree3() {
        int input = 9;
        assertTrue(isPowerOfThree(input));
    }

    @Test
    void testPowerOfThree4() {
        int input = 45;
        assertFalse(isPowerOfThree(input));
    }

    @Test
    void testPowerOfThree5() {
        int input = 6;
        assertFalse(isPowerOfThree(input));
    }
}
