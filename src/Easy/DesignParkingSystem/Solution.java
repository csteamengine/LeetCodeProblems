package Easy.DesignParkingSystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParkingSystem {

    int[] spaces = new int[3];

    public ParkingSystem(int big, int medium, int small) {
        spaces[0] = big;
        spaces[1] = medium;
        spaces[2] = small;
    }

    public boolean addCar(int carType) {
        if(spaces[carType-1] > 0){
            spaces[carType-1]--;
            return true;
        }

        return false;
    }
}

public class Solution {
    @Test
    void testParkingSystem() {
    }
}
