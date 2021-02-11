package Mock8.Question2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < candyType.length; i++){
            set.add(candyType[i]);
            if(set.size() >= candyType.length/2) break;
        }
        return set.size();
    }

    @Test
    void test1() {
        int[] input = {1,1,2,2,3,3};
        int exp = 3;

        assertEquals(exp, distributeCandies(input));
    }

    @Test
    void test2() {
        int[] input = {1,1,2,3};
        int exp = 2;

        assertEquals(exp, distributeCandies(input));
    }

    @Test
    void test3() {
        int[] input = {6, 6, 6, 6};
        int exp = 1;

        assertEquals(exp, distributeCandies(input));
    }
}