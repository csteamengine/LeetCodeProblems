package RobotreturnToOrigin;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

public class Solution {
    @Test
    void firstTest(){
        String input = "RLUDRLUD";

        boolean result = judgeCircle(input);

        assertTrue(result);
    }

    @Test
    void second(){
        String input = "RRRRRLLU";

        boolean result = judgeCircle(input);

        assertFalse(result);
    }

    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;

        for (char ch: moves.toCharArray()) {
            if(ch == 'R'){
                y += 1;
            }else if(ch == 'L'){
                y -= 1;
            }else if(ch == 'U'){
                x += 1;
            }else if(ch == 'D'){
                x -= 1;
            }
        }

        return x == 0 && y == 0;
    }
}
