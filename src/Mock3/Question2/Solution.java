package Mock3.Question2;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {
    public int hammingDistance(int x, int y) {
        int counter = 0;
        int xor = x ^ y;
        while(xor != 0){
            if((xor & 1) == 1){
                counter++;
            }
            xor = xor >> 1;
        }
        return counter;
    }

    @Test
    void test1() {
        int input = 1;
        int input2 = 4;
        int exp = 2;

        assertEquals(exp, hammingDistance(input, input2));
    }

    @Test
    void test2() {
        int input = 3;
        int input2 = 5;
        int exp = 2;

        assertEquals(exp, hammingDistance(input, input2));
    }
}