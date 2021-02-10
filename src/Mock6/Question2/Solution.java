package Mock6.Question2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {
        if(cells==null || cells.length==0 || N<=0) return cells;
        boolean hasCycle = false;
        int cycle = 0;
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<N;i++){
            int[] next = nextDay(cells);
            String key = Arrays.toString(next);
            if(!set.contains(key)){ //store cell state
                set.add(key);
                cycle++;
            }
            else{ //hit a cycle
                hasCycle = true;
                break;
            }
            cells = next;
        }
        if(hasCycle){
            N%=cycle;
            for(int i=0;i<N;i++){
                cells = nextDay(cells);
            }
        }
        return cells;
    }

    private int[] nextDay(int[] cells){
        int[] tmp = new int[cells.length];
        for(int i=1;i<cells.length-1;i++){
            tmp[i]=cells[i-1]==cells[i+1]?1:0;
        }
        return tmp;
    }


    @Test
    void test1() {
        int[] input = {1,0,0,1,0,0,1,0};
        int[] exp = {0,0,1,1,1,1,1,0};
        int days = 1000000000;

        int[] output = prisonAfterNDays(input, days);
        for(int j: output){
            System.out.print(j);
        }
        System.out.println();
        assertArrayEquals(exp, prisonAfterNDays(input, days));
    }
}