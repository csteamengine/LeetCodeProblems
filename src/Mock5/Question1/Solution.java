package Mock5.Question1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 1) return true;
        if(n == 0) return false;

        if(n % 2 == 0){
            return isPowerOfTwo(n/2);
        }
        return false;
    }

    @Test
    void test1() {
        int input = 1;

        assertTrue(isPowerOfTwo(input));
    }

    @Test
    void test2() {
        int input = 16;

        assertTrue(isPowerOfTwo(input));
    }

    @Test
    void test3() {
        int input = 3;

        assertFalse(isPowerOfTwo(input));
    }

    @Test
    void test4() {
        int input = 4;

        assertTrue(isPowerOfTwo(input));
    }

    @Test
    void test5() {
        int input = 5;

        assertFalse(isPowerOfTwo(input));
    }

    @Test
    void test6() {
        int input = 0;

        assertFalse(isPowerOfTwo(input));
    }
}
