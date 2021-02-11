package Mock8.Question1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {
    public int fib(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }

    @Test
    void test1() {
        int input = 2;
        int exp = 1;

        assertEquals(exp, fib(input));
    }

    @Test
    void test2() {
        int input = 3;
        int exp = 2;

        assertEquals(exp, fib(input));
    }

    @Test
    void test3() {
        int input = 4;
        int exp = 3;

        assertEquals(exp, fib(input));
    }

    @Test
    void test4() {
        int input = 5;
        int exp = 5;

        assertEquals(exp, fib(input));
    }
}
