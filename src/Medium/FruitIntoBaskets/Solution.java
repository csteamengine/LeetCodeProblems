package Medium.FruitIntoBaskets;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Solution {


    @Test
    void main() {
        int[] input = {3,3,3,1,2,1,1,2,3,3,4};
        int expected = 5;

        int result = totalFruit(input);
        assertEquals(expected, result);
    }

    public int totalFruit(int[] tree) {

        int max = 0;
        for(int i = 0; i<tree.length; i++){
            HashSet<Integer> baskets = new HashSet<>();
            int counter = 0;

            if(max > (tree.length-i)) break;

            for(int j = i; j<tree.length; j++){
                if(baskets.size() < 2){
                    baskets.add(tree[j]);
                    counter++;
                }else if(baskets.contains(tree[j])){
                    counter++;
                }else{
                    break;
                }
            }
            if(counter > max){
                max = counter;
            }
        }

        return max;
    }
}
