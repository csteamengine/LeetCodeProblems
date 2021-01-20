package ContainsDuplicate;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        for (int num : nums) {
            if (hash.contains(num)) return true;
            hash.add(num);
        }
        return false;
    }

    @Test
    void testContainsDuplicate() {
        int[] test1 = {1,2,3,1};

        assertTrue(containsDuplicate(test1));
    }

    @Test
    void testNoDuplicate() {
        int[] test1 = {1,2,3,4};

        assertFalse(containsDuplicate(test1));
    }

    @Test
    void testContainsMultipleDuplicates() {
        int[] test1 = {1,1,1,3,3,4,3,2,4,2};

        assertTrue(containsDuplicate(test1));
    }
}
