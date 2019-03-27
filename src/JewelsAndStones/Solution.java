package JewelsAndStones;

public class Solution {
    public int numJewelsInStones(String J, String S){
        int numJewels = 0;
        for(char stone: S.toCharArray()){
            if(J.indexOf(stone) >= 0){
                numJewels++;
            }
        }

        return numJewels;
    }
}

