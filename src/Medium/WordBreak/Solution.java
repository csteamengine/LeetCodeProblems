package Medium.WordBreak;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Solution {


    @Test
    void main() {
        ArrayList<String> wordDict = new ArrayList<>();
        wordDict.add("leet");
        wordDict.add("code");

        //Should be true with ca rs
        boolean result = wordBreak("leetcode", wordDict);

        assertTrue(result);
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        boolean result = false;
        for(String word: wordDict){
            if(s.contains(word)){
                String temp = s.replace(word, " ");
                temp = temp.trim();
                result = wordBreak(temp, wordDict);
                if(result) break;
            }
        }

        if(result || s.length() == 0){
            return true;
        }

        return false;
    }

}
