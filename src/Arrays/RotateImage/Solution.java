package Arrays.RotateImage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Solution {
    public void rotate(int[][] matrix) {

        for(int row = 0; row < matrix.length; row++){
            for(int col = row; col < matrix[0].length; col++){
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }

        int length = matrix.length-1;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][length-j];
                matrix[i][length-j] = temp;
            }
        }
    }

    @Test
    void testRotateNine() {
        int[][] test1 = {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};
        int[][] expected = {{7, 4, 1},
                            {8, 5, 2},
                            { 9, 6, 3}};

        rotate(test1);

        assertArrayEquals(expected, test1);
    }

    @Test
    void testRotate() {
        int[][] test1 = {{5,1,9,11},
                         {2,4,8,10},
                         {13,3,6,7},
                         {15,14,12,16}};
        int[][] expected = {{15,13,2,5},
                            {14,3,4,1},
                            {12,6,8,9},
                            {16,7,10,11}};

        rotate(test1);

        assertArrayEquals(expected, test1);
    }
}

