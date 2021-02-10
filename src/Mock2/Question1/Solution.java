package Mock2.Question1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {
    public String licenseKeyFormatting(String S, int K) {
        String sCopy = S.replace("-", "");
        StringBuilder sBuilder = new StringBuilder();
        String temp = "";
        int index = sCopy.length()-1;

        while(index >= 0){
            if(index >= K){
                for(int i = 0; i < K; i++){
                    sBuilder.append(Character.toUpperCase(sCopy.charAt(index)));
                    index--;
                }
                sBuilder.append("-");
            }else{
                sBuilder.append(Character.toUpperCase(sCopy.charAt(index)));
                index--;
            }
        }

        temp = sBuilder.toString();
        sBuilder = new StringBuilder();

        for(int i = temp.length()-1; i >= 0; i--){
            sBuilder.append(temp.charAt(i));
        }

        return sBuilder.toString();
    }

    @Test
    void test1() {
        String input = "5F3Z-2e-9-w";
        int k = 4;
        String exp = "5F3Z-2E9W";

        assertEquals(exp, licenseKeyFormatting(input, k));
    }

    @Test
    void test2() {
        String input = "2-5g-3-J";
        int k = 2;
        String exp = "2-5G-3J";

        assertEquals(exp, licenseKeyFormatting(input, k));
    }
}
