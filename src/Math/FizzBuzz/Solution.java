package Math.FizzBuzz;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> output = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String add = "";
            if(i % 3 == 0){
                add += "Fizz";
            }
            if(i % 5 == 0){
                add += "Buzz";
            }
            if(add.equals("")){
                add += i;
            }
            output.add(add);
        }
        return output;
    }

    @Test
    void testRob() {
        ArrayList<String> expected = new ArrayList<>();
        expected.add("1");
        expected.add("2");
        expected.add("Fizz");
        expected.add("4");
        expected.add("Buzz");
        expected.add("Fizz");
        expected.add("7");
        expected.add("8");
        expected.add("Fizz");
        expected.add("Buzz");
        expected.add("11");
        expected.add("Fizz");
        expected.add("13");
        expected.add("14");
        expected.add("FizzBuzz");


        assertEquals(expected, fizzBuzz(15));
    }
}
