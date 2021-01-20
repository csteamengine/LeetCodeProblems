package Strings.ReverseInteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {
    public int reverse(int x) {
        int rev = 0;
        while(x != 0){
//            System.out.println(x);
            int pop = x % 10;
//            System.out.println(pop);
            x /= 10;
            if(rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if(rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
            System.out.println(rev);
        }

        return rev;
    }

    @Test
    void twoSum1() {
        int input = 123;
        int output = 321;

        assertEquals(output, reverse(input));

    }

    @Test
    void twoSum2() {
        int input = -123;
        int output = -321;

        assertEquals(output, reverse(input));

    }

    @Test
    void twoSum3() {
        int input = 120;
        int output = 21;

        assertEquals(output, reverse(input));

    }

    @Test
    void twoSum4() {
        int input = 0;
        int output = 0;

        assertEquals(output, reverse(input));

    }

}
