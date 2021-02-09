package DynamicProgramming.BestTimeToBuyAndSell;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {
    public int maxProfit(int[] prices) {
        int currMin = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < currMin){
                currMin = prices[i];
            }else if(prices[i] - currMin > maxProfit){
                maxProfit = prices[i] - currMin;
            }
        }
        return maxProfit;
    }


    @Test
    void test1() {
        int expected = 5;
        int[] prices = {7,1,5,3,6,4};
        assertEquals(expected, maxProfit(prices));
    }

    @Test
    void test2() {
        int expected = 0;
        int[] prices = {7,6,4,3,1};
        assertEquals(expected, maxProfit(prices));
    }

    @Test
    void test3() {
        int expected = 5;
        int[] prices = {1, 2, 3, 4, 5, 6};
        assertEquals(expected, maxProfit(prices));
    }

    @Test
    void test4() {
        int expected = 3;
        int[] prices = {2, 1, 4};
        assertEquals(expected, maxProfit(prices));
    }

    @Test
    void test5() {
        int expected = 9;
        int[] prices = {7, 4, 2, 11, 1};
        assertEquals(expected, maxProfit(prices));
    }
}
