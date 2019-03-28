package Medium.LongestPalindromicSubstring;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Solution {


    @Test
    void main() {
        String input = "a";
        String expected = "a";
        String result = longestPalindrome(input);
        assertEquals(expected, result);
    }

    public String longestPalindrome(String s) {
        String currAnswer = "";
        for(int i = 0; i<s.length(); i++){
            if(currAnswer.length() <= s.length()-i){
                for(int j = s.length()-1; j>=i; j--){
                    String subString = s.substring(i, j+1);
                    if(isPalindrome(subString) && subString.length() > currAnswer.length()){
                        currAnswer = subString;
                    }
                }
            }
        }

        return currAnswer;
    }

    public boolean isPalindrome(String s){
        int left = 0;
        int right = s.length()-1;

        if(s.length() == 1) return true;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

}
