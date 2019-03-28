package Hard.UniquePathsIII;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        System.out.println("Curr Grid:");
        for(int[] arr: grid){
            System.out.println(Arrays.toString(arr));
        }

        for(int i = 0; i< grid.length; i++){
            for(int j = 0; j<grid[0].length; j++){
                if(grid[i][j] == 1){
                    x = i;
                    y = j;
                    grid[i][j] = -1;
                }
            }
        }


        //left
        if((x-1) >= 0 && grid[x-1][y] != -1){
            System.out.println("Left");
            if(grid[x-1][y] == 2){
                if(checkGrid(grid)){
                    output++;
                }
            }else{
                int[][] tempGrid = grid;
                tempGrid[x-1][y] = 1;
                tempGrid[x][y] = -1;
                output += uniquePathsIII(tempGrid);
            }
        }


        //right
        if((x+1) < grid.length && grid[x+1][y] != -1){
            System.out.println("Right");
            if(grid[x+1][y] == 2){
                if(checkGrid(grid)){
                    output++;
                }
            }else{
                int[][] tempGrid = grid;
                tempGrid[x+1][y] = 1;
                tempGrid[x][y] = -1;
                output += uniquePathsIII(tempGrid);
            }
        }


        //up
        if((y-1) >= 0 && grid[x][y-1] != -1){
            System.out.println("Up");
            if(grid[x][y-1] == 2){
                if(checkGrid(grid)){
                    output++;
                }
            }else{
                int[][] tempGrid = grid;
                tempGrid[x][y-1] = 1;
                tempGrid[x][y] = -1;
                output += uniquePathsIII(tempGrid);
            }
        }


        //down
        if((y+1) < grid[0].length && grid[x][y+1] != -1){
            System.out.println("Down");
            if(grid[x][y+1] == 2){
                if(checkGrid(grid)){
                    output++;
                }
            }else{
                int[][] tempGrid = grid;
                tempGrid[x][y+1] = 1;
                tempGrid[x][y] = -1;
                output += uniquePathsIII(tempGrid);
            }
        }

        System.out.println("Output: " + output);

        return output;
    }

    public boolean checkGrid(int[][] grid){
        System.out.println("Checking Grid:");
        for(int[] arr: grid){
            System.out.println(Arrays.toString(arr));
        }
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
