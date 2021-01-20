package Arrays.BestTimeToBuyAndSell;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        boolean bought = false;
        int purchaseVal = 0;

        for(int i = 0; i < prices.length-1; i++){
            if(prices[i] < prices[i+1]){
                if(!bought){
                    purchaseVal = prices[i];
                    bought = true;
                }
            }else if(bought){
                bought = false;
                maxProfit += prices[i] - purchaseVal;
                purchaseVal = 0;
            }
        }

        if(bought){
            maxProfit += prices[prices.length-1] - purchaseVal;
            purchaseVal = 0;
        }

        return maxProfit;
    }

    @Test
    void testDoublePurchase() {
        int[] test1 = {7,1,5,3,6,4};

        assertEquals(7, maxProfit(test1));

    }

    @Test
    void testSinglePurchaseSingleSell() {
        int[] test2 = {1,2,3,4,5};

        assertEquals(4, maxProfit(test2));
    }

    @Test
    void testNoPurchaseNoSell() {
        int[] test3 = {7,6,4,3,1};

        assertEquals(0, maxProfit(test3));
    }
}
