package GreatestNumberOfCandies;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> output = new ArrayList<>();
        int max = 0;
        for(int i = 0; i<candies.length; i++){
            if(candies[i] > max) max = candies[i];
        }

        for(int i = 0; i < candies.length; i++){
            if(candies[i] + extraCandies >= max){
                output.add(true);
            }else{
                output.add(false);
            }
        }

        return output;
    }

    @Test
    void testKidsWithCandies() {
        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;
        List<Boolean> expectedOutput = new ArrayList<Boolean>();
        expectedOutput.add(true);
        expectedOutput.add(false);
        expectedOutput.add(false);
        expectedOutput.add(false);
        expectedOutput.add(false);

        List<Boolean> output = kidsWithCandies(candies, extraCandies);

        assertTrue(output.equals(expectedOutput));
    }
}
