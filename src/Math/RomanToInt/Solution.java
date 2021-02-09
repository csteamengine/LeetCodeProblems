package Math.RomanToInt;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

public class Solution {
//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000

    public int romanToInt(String s) {
        HashMap<Character, Integer> romans = new HashMap<>();
        romans.put('I', 1);
        romans.put('V', 5);
        romans.put('X', 10);
        romans.put('L', 50);
        romans.put('C', 100);
        romans.put('D', 500);
        romans.put('M', 1000);
        Integer output = romans.get(s.charAt(s.length()-1));

        for(int i = s.length()-1; i>0; i--){
            if(romans.get(s.charAt(i-1)) < romans.get(s.charAt(i))){
                output -= romans.get(s.charAt(i-1));
            }else{
                output += romans.get(s.charAt(i-1));
            }
        }

        return output;
    }

    @Test
    void testRomans() {
        int exp = 3;
        assertEquals(exp, romanToInt("III"));
    }

    @Test
    void testRomans2() {
        int exp = 4;
        assertEquals(exp, romanToInt("IV"));
    }

    @Test
    void testRomans3() {
        int exp = 9;
        assertEquals(exp, romanToInt("IX"));
    }

    @Test
    void testRomans4() {
        int exp = 58;
        assertEquals(exp, romanToInt("LVIII"));
    }

    @Test
    void testRomans5() {
        int exp = 1994;
        assertEquals(exp, romanToInt("MCMXCIV"));
    }
}
