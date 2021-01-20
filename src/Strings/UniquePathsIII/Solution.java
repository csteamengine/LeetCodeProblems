package Strings.UniquePathsIII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {
    @Test
    void main() {
        int[][] input = {{1,0,0,0},{0,0,0,0},{0,0,2,-1}};

        int result = uniquePathsIII(input);
        assertEquals(2, result);
    }

    public int uniquePathsIII(int[][] grid) {
        int output = 0;
        int x = 0;
        int y = 0;

        int[][] left = new int[grid.length][grid[0].length];
        int[][] right = new int[grid.length][grid[0].length];
        int[][] up = new int[grid.length][grid[0].length];
        int[][] down = new int[grid.length][grid[0].length];

        for(int i = 0; i< grid.length; i++){
            for(int j = 0; j<grid[0].length; j++){
                if(grid[i][j] == 1){
                    x = i;
                    y = j;
                    grid[i][j] = -1;
                }

                left[i][j] = grid[i][j];
                right[i][j] = grid[i][j];
                up[i][j] = grid[i][j];
                down[i][j] = grid[i][j];
            }
        }


        //left
        if((x-1) >= 0 && left[x-1][y] != -1){
            if(left[x-1][y] == 2){
                if(checkGrid(left)){
                    output++;
                }
            }else{
                left[x-1][y] = 1;
                left[x][y] = -1;
                output += uniquePathsIII(left);
            }
        }


        //right
        if((x+1) < right.length && right[x+1][y] != -1){
            if(right[x+1][y] == 2){
                if(checkGrid(right)){
                    output++;
                }
            }else{
                right[x+1][y] = 1;
                right[x][y] = -1;
                output += uniquePathsIII(right);
            }
        }


        //up
        if((y-1) >= 0 && grid[x][y-1] != -1){
            if(grid[x][y-1] == 2){
                if(checkGrid(grid)){
                    output++;
                }
            }else{
                up[x][y-1] = 1;
                up[x][y] = -1;
                output += uniquePathsIII(up);
            }
        }


        //down
        if((y+1) < grid[0].length && grid[x][y+1] != -1){
            if(grid[x][y+1] == 2){
                if(checkGrid(grid)){
                    output++;
                }
            }else{
                down[x][y+1] = 1;
                down[x][y] = -1;
                output += uniquePathsIII(down);
            }
        }


        return output;
    }

    public boolean checkGrid(int[][] grid){
        for(int i = 0; i< grid.length; i++){
            for(int j = 0; j<grid[0].length; j++){
                if(grid[i][j] == 0){
                    return false;
                }
            }
        }
        return true;
    }

}
