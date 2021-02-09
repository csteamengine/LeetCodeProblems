package Math.FindPrimes;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {
    public int countPrimes(int n) {
        boolean isPrime = false;
        int output = 0;


        for(int i = 2; i< n; i++){
            if (isPrime(i)) {
                output++;
            }
        }

        return output;
    }

    public boolean isPrime(int num){
        for(int j = 2; j * j <= num; j++){
            if(num % j == 0){
                return false;
            }
        }
        return true;
    }

    @Test
    void testCountPrimes() {
        int expected = 4;
        assertEquals(expected, countPrimes(10));
    }

    @Test
    void testCountPrimes2() {
        int expected = 0;
        assertEquals(expected, countPrimes(0));
    }

    @Test
    void testCountPrimes3() {
        int expected = 0;
        assertEquals(expected, countPrimes(1));
    }
}
