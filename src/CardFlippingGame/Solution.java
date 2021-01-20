package CardFlippingGame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {
    public int flipgame(int[] fronts, int[] backs) {
        //While true
        //Find lowest number and determine if there are any cards with that as a double
        //If double, then move on to the next highest number
        int currLow = 0;
        boolean trigger = false;

        for(int i = 0; i < fronts.length; i++){
            if(currLow == 0 || fronts[i] < currLow){
                for(int j = 0; j < fronts.length; j++){
                    if(fronts[i] == fronts[j] && fronts[j] == backs[j]){
                        trigger = true;
                        break;
                    }
                }
                if(!trigger){
                    currLow = fronts[i];
                }
            }
            trigger = false;
        }

        for(int i = 0; i < backs.length; i++){

            if(currLow == 0 || backs[i] < currLow){
                for(int j = 0; j < backs.length; j++){
                    if(backs[i] == backs[j] && backs[j] == fronts[j]){
                        trigger = true;
                        break;
                    }
                }
                if(!trigger){
                    currLow = backs[i];
                }
            }
            trigger = false;
        }


        return currLow;
    }

    @Test
    void testFlipGame() {
//      [1,2,4,4,7]
//      [1,3,4,1,3]
        int[] firstFronts = {1,2,4,4,7};
        int[] firstBacks = {1,3,4,1,3};
        int[] secondFronts = {1,1};
        int[] secondBacks = {1,2};

        assertEquals(2, flipgame(firstFronts, firstBacks));
        assertEquals(2, flipgame(secondFronts, secondBacks));

    }
}
