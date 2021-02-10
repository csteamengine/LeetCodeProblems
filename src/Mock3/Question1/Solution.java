package Mock3.Question1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Solution {
    public boolean canWinNim(int n) {
        if(n % 4 == 0){
            return false;
        }
        return true;
    }

    @Test
    void test1() {
        int input = 4;

        assertFalse(canWinNim(input));
    }

    @Test
    void test2() {
        int input = 1;

        assertTrue(canWinNim(input));
    }

    @Test
    void test3() {
        int input = 2;

        assertTrue(canWinNim(input));
    }

    @Test
    void test4() {
        int input = 5;

        assertTrue(canWinNim(input));
    }

}
