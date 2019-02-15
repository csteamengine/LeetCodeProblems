package UniqueMorseCodeWords;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class Solution {
    String[] MORSE = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    @Test
    void main(){
        String[] testStrings = {"gin", "zen", "gig", "msg"};
        Solution solution = new Solution();
        int numTransformations = solution.uniqueMorseRepresentations(testStrings);
        assertEquals(2, numTransformations);
    }

    public int uniqueMorseRepresentations(String[] words) {
        Set<String> transformations = new HashSet<>();
        for(String word: words){
            transformations.add(transform(word));
        }

        return transformations.size();
    }

    private String transform(String word){
        StringBuilder transformedWord = new StringBuilder();

        for(char letter: word.toCharArray()){
            transformedWord.append(MORSE[letter-'a']);
        }

        return transformedWord.toString();
    }

}
