package Arrays.MoveZeroes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Solution {
    public void moveZeroes(int[] nums) {
        int creeper = 0;
        int runner = 0;
        while(creeper < nums.length && runner < nums.length){
            if(nums[creeper] != 0){
                creeper++;
            }else if(nums[runner] != 0){
                int temp = nums[creeper];
                nums[creeper] = nums[runner];
                nums[runner] = temp;
                creeper++;
            }
            runner++;
        }

    }

    @Test
    void testMoveZeroes() {
        int[] test1 = {0, 1, 0, 3, 12};
        int[] expected = {1, 3, 12, 0, 0};

        moveZeroes(test1);

        assertArrayEquals(expected, test1);

    }

    @Test
    void testMoveZeroesAllZeroes() {
        int[] test1 = {0,0,0,0,0};
        int[] expected = {0,0,0,0,0};

        moveZeroes(test1);

        assertArrayEquals(expected, test1);

    }

    @Test
    void testMoveZeroesLastDigit() {
        int[] test1 = {0, 0, 0, 0, 1};
        int[] expected = {1, 0, 0, 0, 0};

        moveZeroes(test1);

        assertArrayEquals(expected, test1);
    }

    @Test
    void testMoveZeroesOneFirstDigit() {
        int[] test1 = {1, 0, 0, 0, 0};
        int[] expected = {1, 0, 0, 0, 0};

        moveZeroes(test1);

        assertArrayEquals(expected, test1);
    }
}

