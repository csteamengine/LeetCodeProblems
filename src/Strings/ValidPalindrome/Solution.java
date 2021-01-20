package Strings.ValidPalindrome;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Solution {
    public boolean isPalindrome(String s) {
        //remove spaces, special characters and all cases
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if(s.length() <= 1) return true;

        int left = 0;
        int right = s.length()-1;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    @Test
    void test1() {
        String input1 = "A man, a plan, a canal: Panama";

        assertTrue(isPalindrome(input1));
    }

    @Test
    void test2() {
        String input1 = "race a car";

        assertFalse(isPalindrome(input1));
    }

    @Test
    void test3() {
        String input1 = "0P";

        assertFalse(isPalindrome(input1));
    }
}
