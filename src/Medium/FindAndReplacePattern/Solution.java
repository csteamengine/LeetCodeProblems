package Medium.FindAndReplacePattern;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Solution {


    @Test
    void main() {
        String[] words = {"abc","deq","mee","aqq","dkd","ccc"};
        String pattern = "abb";
        List<String> result = findAndReplacePattern(words, pattern);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("mee");
        expected.add("aqq");
        assertArrayEquals(expected.toArray(), result.toArray());

    }
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        ArrayList<String> output = new ArrayList<>();
        String replacedPattern = replace(pattern);
        for(String word: words){
            String replacedWord = replace(word);
            if(replacedPattern.equals(replacedWord)){
                output.add(word);
            }
        }
        return output;
    }

    public String replace(String word){
        String output = "";
        HashMap<Character, Integer> map = new HashMap<>();
        int index = 0;
        for(int i = 0; i< word.length(); i++){
            Character letter = word.charAt(i);
            if(!map.containsKey(letter)){
                map.put(letter, index);
                index++;
            }
        }
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i<word.length(); i++){
            builder.append(map.get(word.charAt(i)));
        }

        return builder.toString();
    }
}
