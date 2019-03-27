package Medium.MaxIncreaseToKeepCitySkyline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {
    @Test
    void main() {
        int[][] grid = {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
        int output = maxIncreaseKeepingSkyline(grid);

        assertEquals(output, 35);
    }

    public int maxIncreaseKeepingSkyline(int[][] grid){
        int[][] highestX = new int[grid.length][grid[0].length];
        int[][] highestY = new int[grid.length][grid[0].length];
        int output = 0;

        for(int i = 0; i< grid.length; i++){
            int highx = grid[i][0];

            for(int j =0; j< grid[0].length; j++){
                if(grid[i][j] > highx){
                    highx = grid[i][j];
                }
            }

            for(int j = 0; j<grid[0].length; j++){
                highestX[i][j] = highx;
            }
        }

        for(int i = 0; i< grid[0].length; i++){
            int highy = grid[0][i];
            for(int j = 0; j< grid.length; j++){
                 if(grid[j][i] > highy){
                        highy = grid[j][i];
                 }
            }
            for(int j = 0; j<grid.length; j++){
                highestY[j][i] = highy;
            }
        }

        for(int i = 0; i< grid.length; i++){
            for(int j = 0; j<grid[0].length; j++){
                if(highestX[i][j] < highestY[i][j]){
                    output += highestX[i][j] - grid[i][j];
                }else{
                    output += highestY[i][j] - grid[i][j];
                }
            }
        }

        return output;
    }
}
