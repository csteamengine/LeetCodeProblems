package Strings.FirstUniqueCharacterInString;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        int n = s.length();
        // build hash map : character and how often it appears
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        // find the index
        for (int i = 0; i < n; i++) {
            if (count.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }

    @Test
    void test1() {
        String input = "leetcode";
        int expected = 0;

        assertEquals(expected, firstUniqChar(input));
    }

    @Test
    void test2() {
        String input = "loveleetcode";
        int expected = 2;

        assertEquals(expected, firstUniqChar(input));
    }

    @Test
    void test3() {
        String input = "llll";
        int expected = -1;

        assertEquals(expected, firstUniqChar(input));
    }

    @Test
    void test4() {
        String input = "aadadaad";
        int expected = -1;

        assertEquals(expected, firstUniqChar(input));
    }

}
