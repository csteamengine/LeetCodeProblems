package Arrays.ValidSudoku;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

public class Solution {
    public boolean isValidSudoku(char[][] board) {

        //TODO check each row for repitions
        //TODO Check each column for repitions
        //TODO check each 3x3 grid for repititions


        for(int row = 0; row < board.length; row++){
            HashSet<Character> hash = new HashSet<>();
            for(int col = 0; col < board[0].length; col++){
//                System.out.println(board[row][col]);
                if(board[row][col] != '.' && hash.contains(board[row][col])){
                    return false;
                }
                hash.add(board[row][col]);
            }
        }

        for(int col = 0; col < board.length; col++){
            HashSet<Character> hash = new HashSet<>();
            for(int row = 0; row < board[0].length; row++){
//                System.out.println(board[row][col]);
                if(board[row][col] != '.' && hash.contains(board[row][col])){
                    return false;
                }
                hash.add(board[row][col]);
            }
        }

        for(int rowOffset = 0; rowOffset <3; rowOffset++){
            for(int colOffset = 0; colOffset < 3; colOffset++){
                HashSet<Character> hash = new HashSet<>();
                for(int i =3*rowOffset; i < (3*rowOffset) + 3; i++){
                    for(int j =3*colOffset; j < (3*colOffset) + 3; j++){
                        System.out.print("Checking: ");
                        System.out.print(i);
                        System.out.println(j);
                        if(board[i][j] != '.' && hash.contains(board[i][j])){
                            return false;
                        }
                        hash.add(board[i][j]);
                    }
                }
            }
        }

        return true;
    }

    @Test
    void isValidSudokuTrue() {
        char[][] board =
                {{'5','3','.','.','7','.','.','.','.'}
                ,{'6','.','.','1','9','5','.','.','.'}
                ,{'.','9','8','.','.','.','.','6','.'}
                ,{'8','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}};

        assertTrue(isValidSudoku(board));
    }

    @Test
    void isValidSudokuFalse() {
        char[][] board =
                {{'8','3','.','.','7','.','.','.','.'}
                ,{'6','.','.','1','9','5','.','.','.'}
                ,{'.','9','5','.','.','.','.','6','.'}
                ,{'8','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}};

        assertFalse(isValidSudoku(board));
    }

    @Test
    void isValidSudokuFalseSameSquare() {
        char[][] board =
                {{'8','3','.','.','7','.','.','.','.'}
                ,{'6','.','.','1','9','5','.','.','.'}
                ,{'.','9','8','.','.','.','.','6','.'}
                ,{'5','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}};

        assertFalse(isValidSudoku(board));
    }

    @Test
    void isValidSudokuFalseSameSquareTwice() {
        char[][] board =
                    {{'.','.','.','.','5','.','.','1','.'},
                     {'.','4','.','3','.','.','.','.','.'},
                     {'.','.','.','.','.','3','.','.','1'},
                     {'8','.','.','.','.','.','.','2','.'},
                     {'.','.','2','.','7','.','.','.','.'},
                     {'.','1','5','.','.','.','.','.','.'},
                     {'.','.','.','.','.','2','.','.','.'},
                     {'.','2','.','9','.','.','.','.','.'},
                     {'.','.','4','.','.','.','.','.','.'}};

        assertFalse(isValidSudoku(board));
    }
    @Test
    void isValidSudokuFalseSameSquareLastSquare() {
        char[][] board =
                {{'.','.','.','.','5','.','.','1','.'},
                 {'.','4','.','3','.','.','.','.','.'},
                 {'.','.','.','.','.','.','.','.','1'},
                 {'8','.','.','.','.','.','.','2','.'},
                 {'.','.','2','.','7','.','.','.','.'},
                 {'.','1','5','.','.','.','.','.','.'},
                 {'.','.','.','.','.','2','.','.','.'},
                 {'.','2','.','9','.','.','.','.','.'},
                 {'.','.','4','.','.','.','.','.','.'}};

        assertFalse(isValidSudoku(board));
    }

}

