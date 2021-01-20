package HouseRobber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {
    public int rob(int[] nums) {
        int prevHouseMax = 0;
        int adjHouseMax = 0;

        for(int i = 0; i<nums.length; i++){
            int temp = Math.max(nums[i] + prevHouseMax, adjHouseMax);
            prevHouseMax = adjHouseMax;
            adjHouseMax = temp;
        }

        return adjHouseMax;
    }

    @Test
    void testRob() {
        int expected = 4;
        int expected2 = 4;
        int[] houses = {1,2,3,1};
        int[] houses2 = {2,1,1,2};

        assertEquals(expected, rob(houses));
        assertEquals(expected2, rob(houses2));
    }
}
