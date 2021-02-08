package SearchingAndSorting.FirstBadVersion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {
    public boolean isBadVersion(int version){
        boolean[] versions = {false, false, false, true, true};
        return versions[version-1];
    }

    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public void printArray(int[] array){
        for(int i = 0; i< array.length; i++){
            System.out.print(array[i]);
            System.out.print(',');
        }
        System.out.println();
    }

    @Test
    void testVersions() {
        int expected = 4;
        assertEquals(expected, firstBadVersion(5));
    }
}
