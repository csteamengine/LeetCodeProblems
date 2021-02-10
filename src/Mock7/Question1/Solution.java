package Mock7.Question1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;
        while(left < right){
            char tempLeft = s[left];
            s[left] = s[right];
            s[right] = tempLeft;
            left++;
            right--;
        }
    }

    @Test
    void test1() {
        char[] input = {'h','e','l','l','o'};
        char[] exp = {'o','l','l','e', 'h'};
        reverseString(input);
        assertArrayEquals(exp, input);
    }

    @Test
    void test2() {
        char[] input = {' '};
        char[] exp = {' '};
        reverseString(input);
        assertArrayEquals(exp, input);
    }

    @Test
    void test3() {
        char[] input = {};
        char[] exp = {};
        reverseString(input);
        assertArrayEquals(exp, input);
    }

    @Test
    void test4() {
        char[] input = {'h', 'a'};
        char[] exp = {'a', 'h'};
        reverseString(input);
        assertArrayEquals(exp, input);
    }
}
