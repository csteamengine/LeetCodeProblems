package FlippingAnImage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Solution {
    @Test
    void main() {
        int[][] image1 = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] goal = {{1,0,0}, {0,1,0}, {1,1,1}};
        int[][] imageResult = flipAndInvertImage(image1);

        for(int i = 0; i<imageResult.length; i++){
            for(int j = 0; j<imageResult[i].length; j++){
                System.out.print(imageResult[i][j]);
                System.out.print(",");
            }
            System.out.println();
        }

        assertArrayEquals(goal, imageResult);
    }

    public int[][] flipAndInvertImage(int[][] A) {
        for(int i = 0; i<A.length; i++){
            int left = 0;
            int right = A[i].length-1;
            while(left<=right){
                int tempLeft = A[i][left];
                int tempRight = A[i][right];
                if(left == right){
                    A[i][left] = swap(tempLeft);
                    left++;
                }else{
                    A[i][left] = swap(tempRight);
                    A[i][right] = swap(tempLeft);

                    left++;
                    right--;
                }
            }
        }
        return A;
    }

    public int swap(int input){
        if(input == 0){
            return 1;
        }
        return 0;
    }
}
