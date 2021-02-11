package Mock10.Question2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int f1 = 0, f2 = 0;
        for (int i = cost.length - 1; i >= 0; --i) {
            int f0 = cost[i] + Math.min(f1, f2);
            f2 = f1;
            f1 = f0;
        }
        return Math.min(f1, f2);

//        return Math.min(recurseMinCost(0, cost), recurseMinCost(1, cost));
    }

    public int recurseMinCost(int index, int[] cost){
        if(index >= cost.length){
            return 0;
        }

        return cost[index] + Math.min(recurseMinCost(index+1, cost), recurseMinCost(index+2, cost));
    }

    @Test
    void test1() {
        int[] input = {10, 15, 20};
        int exp = 15;

        assertEquals(exp, minCostClimbingStairs(input));
    }

    @Test
    void test2() {
        int[] input = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int exp = 6;

        assertEquals(exp, minCostClimbingStairs(input));
    }

    @Test
    void test3() {
        int[] input = {0,2,2,1};
        int exp = 2;

        assertEquals(exp, minCostClimbingStairs(input));
    }

    @Test
    void test4() {
        int[] input = {2,2,1,0};
        int exp = 2;

        assertEquals(exp, minCostClimbingStairs(input));
    }
}