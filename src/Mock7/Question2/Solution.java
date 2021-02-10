package Mock7.Question2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {
    public int numSubmat(int[][] mat) {

        int M = mat.length, N = mat[0].length;

        int res = 0;
        for (int up = 0; up < M; ++up) {
            int[] h = new int[N];
            Arrays.fill(h, 1);
            for (int down = up; down < M; ++down) {
                for (int k = 0; k < N; ++k) h[k] &= mat[down][k];
                res += countOneRow(h);
            }
        }

        return res;
    }

    private int countOneRow(int[] A) {

        int res = 0, length = 0;
        for (int j : A) {
            length = (j == 0 ? 0 : length + 1);
            res += length;
        }
        return res;
    }

    @Test
    void test1() {
        int[][] input = {{0,1,1,0},
                        {0,1,1,1},
                        {1,1,1,0}};

        int exp = 24;

        assertEquals(exp, numSubmat(input));
    }
}