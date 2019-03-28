package Medium.StringToInt;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {
    @Test
    void main() {
        int expected = -42;
        String input = " -42";
        int output = myAtoi(input);

        assertEquals(expected, output);
    }

    public int myAtoi(String str) {
        int toReturn = 0;
        str = str.trim();
        System.out.println(str);
        str = str.replaceAll(" .*", "");
        StringBuilder sb = new StringBuilder();
        boolean negative = false;
        boolean prevSymbol = false;
        if(str.length() == 0){
            return 0;
        }

        if(str.charAt(0) == '-'){
            negative = true;
        }
        System.out.println(str);
        for(char curr: str.toCharArray()){
            if((int) curr >= 48 && (int) curr <= 57){
                int temp = (curr - 48);
                System.out.println(temp);
                sb.append(temp);
                prevSymbol = true;
            }else if(curr == '-' || curr == '+') {
                if(prevSymbol){
                    break;
                }
                prevSymbol = true;
            }else{
                break;
            }

        }

        System.out.println(sb.toString());

        try {
            toReturn = Integer.parseInt(sb.toString());
        }
        catch (NumberFormatException e) {
            if(sb.length() == 0) return 0;
            if (negative) return Integer.MIN_VALUE;
            else return Integer.MAX_VALUE;
        }
        if(negative){
            toReturn *= -1;
        }
        return toReturn;
    }

//    public int myAtoi(String str) {
//        int toReturn = 0;
//        str = str.trim();
//        str = str.replaceAll(" .*", "");
//        boolean isNegative = false;
//        if(str.length() > 0 && str.charAt(0) == '-') isNegative = true;
//        if(str.length() == 0) return 0;
//
//        try {
//            toReturn = Integer.parseInt(str);
//        }
//        catch (NumberFormatException e) {
//            if(str.charAt(0) != '-' && (str.charAt(0) < 48 || str.charAt(0) > 57)) return 0;
//            if (isNegative) return Integer.MIN_VALUE;
//            else return Integer.MAX_VALUE;
//        }
//        return toReturn;
//    }
}
