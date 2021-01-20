package Strings.ValidAnagram;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> letters = new HashMap<>();
        HashMap<Character, Integer> letters2 = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            char c2 = t.charAt(i);
            letters.put(c, letters.getOrDefault(c, 0) + 1);
            letters2.put(c2, letters2.getOrDefault(c2, 0) + 1);
        }

        return letters.equals(letters2);
    }

    @Test
    void test1() {
        String input1 = "anagram";
        String input2 = "nagaram";

        assertTrue(isAnagram(input1, input2));
    }

    @Test
    void test2() {
        String input1 = "rat";
        String input2 = "car";


        assertFalse(isAnagram(input1, input2));
    }

}
