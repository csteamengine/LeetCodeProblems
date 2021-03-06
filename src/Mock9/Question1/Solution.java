package Mock9.Question1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {
    public List<String> invalidTransactions(String[] transactions) {
        ArrayList<String> invalid = new ArrayList<>();
        String[] names = new String[transactions.length];
        int[] time = new int[transactions.length];
        String[] city = new String[transactions.length];
        boolean[] added = new boolean[transactions.length];

        Arrays.fill(added, false);

        //go through each string, explode by comma
        for(int i = 0; i< transactions.length; i++){
            String transaction = transactions[i];
            String[] info = transaction.split(",");
            names[i] = info[0];
            time[i] = Integer.parseInt(info[1]);
            city[i] = info[3];
            if(Integer.parseInt(info[2]) > 1000){
                invalid.add(transaction);
                added[i] = true;
            }
        }

        for(int i = 0; i< names.length; i++){
            for(int j = i+1; j < names.length; j++){
                if(names[i].equals(names[j]) && !city[i].equals(city[j])){
                    if(Math.abs(time[i] - time[j]) < 60){
                        if(!added[i]){
                            invalid.add(transactions[i]);
                            added[i] = true;
                        }
                        if(!added[j]){
                            invalid.add(transactions[j]);
                            added[j] = true;
                        }
                    }
                }
            }
        }

        return invalid;
    }

    @Test
    void test1() {
        String[] transactions = {"alice,20,800,mtv","alice,50,100,beijing"};
        List<String> exp = new ArrayList<>();
        exp.add("alice,20,800,mtv");
        exp.add("alice,50,100,beijing");

        assertArrayEquals(exp.toArray(), invalidTransactions(transactions).toArray());
    }

    @Test
    void test2() {
        String[] transactions = {"alice,20,800,mtv","alice,50,1200,mtv"};
        List<String> exp = new ArrayList<>();
        exp.add("alice,50,1200,mtv");

        assertArrayEquals(exp.toArray(), invalidTransactions(transactions).toArray());
    }

    @Test
    void test3() {
        String[] transactions = {"alice,20,800,mtv","bob,50,1200,mtv"};
        List<String> exp = new ArrayList<>();
        exp.add("bob,50,1200,mtv");

        assertArrayEquals(exp.toArray(), invalidTransactions(transactions).toArray());
    }

    @Test
    void test4() {
        String[] transactions = {"bob,899,1971,budapest","maybe,850,824,budapest","alex,505,187,tokyo","lee,953,1572,toronto","alex,622,61,frankfurt","lee,191,1261,madrid","iris,740,925,luxembourg","iris,681,401,moscow","chalicefy,298,731,madrid","maybe,549,988,moscow","alex,28,1683,singapore","chalicefy,894,550,rome","xnova,892,990,rome","lee,353,1522,shanghai","xnova,804,549,taipei","maybe,716,1727,shenzhen","chalicefy,770,1156,taipei","alex,957,466,munich","bob,381,1136,tokyo","alex,496,1662,luxembourg","xnova,849,354,munich","bob,486,1751,barcelona","xnova,350,14,moscow","iris,858,583,chicago","maybe,511,1002,toronto","maybe,838,585,amsterdam","bob,536,217,toronto","iris,24,1596,hongkong","chalicefy,894,1074,beijing","maybe,502,530,barcelona","lee,95,1916,madrid","maybe,313,1394,madrid","chalicefy,160,1591,hongkong","xnova,280,1023,tokyo","chalicefy,224,920,singapore","bob,725,501,prague","alex,481,35,frankfurt","xnova,336,423,guangzhou","xnova,535,382,istanbul","lee,806,1597,chicago","lee,124,1012,tokyo","iris,627,665,shenzhen","alex,160,651,amsterdam","bob,674,193,dubai","alex,290,770,tokyo","maybe,406,659,shenzhen","lee,493,1002,warsaw","alex,929,591,taipei","bob,456,6,luxembourg","iris,985,1959,newdelhi","xnova,816,1147,singapore","bob,110,73,frankfurt","chalicefy,80,85,warsaw","xnova,266,162,munich","xnova,295,1944,newdelhi","chalicefy,47,141,madrid","xnova,78,205,shanghai","bob,487,260,bangkok","bob,880,628,hongkong","maybe,162,406,mexico","xnova,390,1187,hongkong","chalicefy,810,289,zurich","alex,534,96,jakarta","chalicefy,768,1412,moscow","chalicefy,594,840,milan","xnova,844,1048,luxembourg","xnova,15,274,tokyo","alex,756,1473,hongkong","alex,54,1760,singapore","xnova,353,1644,zurich","lee,353,475,zurich","lee,973,1591,munich","bob,262,120,hongkong","alex,759,31,barcelona","bob,257,803,mexico","alex,353,1074,prague","lee,854,604,chicago","lee,354,140,warsaw","lee,827,521,prague","chalicefy,73,439,zurich","bob,365,899,shanghai","chalicefy,490,1473,beijing","lee,115,531,rome","maybe,358,774,istanbul","xnova,95,824,frankfurt","lee,532,712,hongkong","lee,766,616,newdelhi","lee,231,1150,zurich","maybe,237,71,bangkok","bob,255,747,taipei","lee,520,1825,montreal","bob,744,401,guangzhou","alex,284,877,toronto","maybe,129,1999,frankfurt","xnova,293,294,jakarta","chalicefy,283,901,beijing","lee,884,881,luxembourg","alex,168,1279,shenzhen","alex,348,1434,rome","iris,958,537,paris"};
        List<String> exp = new ArrayList<>();
        exp.add("bob,50,1200,mtv");

        assertArrayEquals(exp.toArray(), invalidTransactions(transactions).toArray());
    }
}
