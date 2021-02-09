package Backtracking.PathWithMaximumGold;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {
    public int getMaximumGold(int[][] grid) {
        return 0;
    }

    public int recurseMaxGold(int[][] grid, int startRow, int startCol){
        return 0;
    }

    @Test
    void testGold1() {
        int[][] input = {{0,6,0}, {5,8,7}, {0,9,0}};
        int exp = 24;

        assertEquals(exp, getMaximumGold(input));
    }

    @Test
    void testGold2() {
        int[][] input = {{1,0,7},{2,0,6},{3,4,5},{0,3,0},{9,0,20}};
        int exp = 24;

        assertEquals(exp, getMaximumGold(input));
    }
}