package GroupByGroupSize;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> output = new ArrayList<>();


        //TODO Go through list of group sizes
        //Add id to output
        // If current inner list if full, create a new one;

        for(int i = 0; i < groupSizes.length; i++){
            boolean placed = false;
            for(int j = 0; j < output.size(); j++){
                System.out.print(groupSizes[output.get(j).get(0)]);
                System.out.print(" --- ");
                System.out.print(output.get(j).size());
                if(groupSizes[i] == groupSizes[output.get(j).get(0)] && output.get(j).size() < groupSizes[output.get(j).get(0)] ){
                    System.out.print("Placing");
                    List<Integer> temp = output.get(j);
                    temp.add(i);
                    output.set(j, temp);
                    placed = true;
                    break;
                }
            }
            if(!placed){
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(i);
                output.add(temp);
                placed = true;
            }
        }

        return output;
    }

    @Test
    void testGroupByGroupSize() {
        int[] input = {3, 3, 3, 3, 3, 1, 3};
        groupThePeople(input);
    }
}
