package Backtracking.CountSortedVowelStrings;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {
    public int countVowelStrings(int n) {
        int a = 1, e = 1, i = 1, o = 1, u = 1;
        while(n > 1) {
            // add new char before prev string
            a = (a + e + i + o + u); // a, e, i, o, u -> aa, ae, ai, ao, au
            e = (e + i + o + u); // e, i, o, u -> ee, ei, eo, eu
            i = (i + o + u); // i, o, u -> ii, io, iu
            o = (o + u); // o, u -> oo, ou
            u = (u);; // u -> uu
            n--;
        }

        return a + e + i + o + u;
    }

    @Test
    void testCount1() {
        int input = 1;
        int exp = 5;
        assertEquals(exp, countVowelStrings(input));
    }

    @Test
    void testCount2() {
        int input = 2;
        int exp = 15;
        assertEquals(exp, countVowelStrings(input));
    }

    @Test
    void testCount3() {
        int input = 33;
        int exp = 66045;
        assertEquals(exp, countVowelStrings(input));
    }
}