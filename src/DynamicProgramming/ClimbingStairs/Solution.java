package DynamicProgramming.ClimbingStairs;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {
    public int climbStairs(int n) {
        int[] saved = new int[n+1];
        return climb_stairs(0, n, saved);
    }

    public int climb_stairs(int index, int stairs, int[] saved){
        if(index > stairs){
            return 0;
        }

        if(index == stairs){
            return 1;
        }

        if(saved[index] > 0){
            return saved[index];
        }

        saved[index] = climb_stairs(index+1, stairs, saved) + climb_stairs(index+2, stairs, saved);
        return saved[index];
    }

    @Test
    void test1() {
        int expected = 2;
        assertEquals(expected, climbStairs(2));
    }

    @Test
    void test2() {
        int expected = 3;
        assertEquals(expected, climbStairs(3));
    }

    @Test
    void test3() {
        int expected = 8;
        assertEquals(expected, climbStairs(5));
    }

}
