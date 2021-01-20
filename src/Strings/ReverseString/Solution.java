package Strings.ReverseString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;
        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    @Test
    void twoSum1() {
        char[] input = {'h', 'e', 'l', 'l', 'o'};
        char[] output = {'o', 'l', 'l', 'e', 'h'};

        reverseString(input);

        assertArrayEquals(output, input);

    }
}

