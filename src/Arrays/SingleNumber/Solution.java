package Arrays.SingleNumber;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

public class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> singles = new HashSet<>();
        HashSet<Integer> doubles = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            if(singles.contains(nums[i])){
                doubles.add(nums[i]);
            }else{
                singles.add(nums[i]);
            }
        }

        Iterator<Integer> it = singles.iterator();
        while(it.hasNext()){
            int curr = it.next();
            if(!doubles.contains(curr)){
                return curr;
            }
        }
        return 0;
    }

    @Test
    void testSingle1() {
        int[] test1 = {2,2,1};

        assertEquals(1, singleNumber(test1));
    }

    @Test
    void testSingle4() {
        int[] test1 = {4,1,2,1,2};

        assertEquals(4, singleNumber(test1));
    }

    @Test
    void testSingle1Again() {
        int[] test1 = {1};

        assertEquals(1, singleNumber(test1));
    }
}
