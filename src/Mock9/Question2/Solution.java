package Mock9.Question2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int N = costs.length/2;
        int[] refund = new int[N * 2];
        int mincost = 0, index = 0;

        for(int[] cost: costs){
            refund[index++] = cost[1] - cost[0];
            mincost += cost[0];
        }
        Arrays.sort(refund);

        for(int i = 0; i< N; i++){
            mincost += refund[i];
        }

        return mincost;
    }

    @Test
    void test1() {
        int[][] input = {{5, 10}, {15,2}};
        int exp = 7;

        assertEquals(exp, twoCitySchedCost(input));
    }
}