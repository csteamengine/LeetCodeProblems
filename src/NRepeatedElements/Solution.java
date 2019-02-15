package NRepeatedElements;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

public class Solution {

    @Test
    void main(){
        int[] input = {5,1,5,2,5,3,5,4};

        int repeated = repeatedNTimes(input);

        assertEquals(5, repeated);

    }


    public int repeatedNTimes(int[] A) {
        HashMap<Integer, Integer> counts = new HashMap<>();
        for(int curr: A){
            int value = 0;
            if(counts.containsKey(curr)){
                value = counts.get(curr);
            }
            value++;
            counts.put(curr, value);
        }

        for(Integer key: counts.keySet()){
            if(counts.get(key) == A.length/2){
                return key;
            }
        }

        return -1;
    }

}
