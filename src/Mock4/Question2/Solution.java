package Mock4.Question2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int index = 1;
        while(index < s.length()){
            String temp = s;
            String sub = s.substring(0, index);
            if(temp.length()%sub.length() == 0){
                while(temp.contains(sub)){
                    temp = temp.replace(sub, "");
                }
                if(temp.length() == 0){
                    return true;
                }
            }
            index++;
        }
        return false;
    }

    @Test
    void test1() {
        String input = "abab";

        assertTrue(repeatedSubstringPattern(input));
    }

    @Test
    void test2() {
        String input = "aba";

        assertFalse(repeatedSubstringPattern(input));
    }

    @Test
    void test3() {
        String input = "abcabcabcabc";

        assertTrue(repeatedSubstringPattern(input));
    }
}