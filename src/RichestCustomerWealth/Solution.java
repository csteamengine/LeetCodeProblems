package RichestCustomerWealth;

import org.junit.jupiter.api.Test;

public class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for(int i = 0; i<accounts.length; i++){
            int count = 0;
            for(int j = 0; j<accounts[i].length; j++){
                count += accounts[i][j];
            }
            if(count > maxWealth){
                maxWealth = count;
            }
        }

        return maxWealth;
    }

    @Test
    void testMaximumWealth() {

    }
}
