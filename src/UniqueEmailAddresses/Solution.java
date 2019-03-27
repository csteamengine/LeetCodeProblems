package UniqueEmailAddresses;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<String>();
        for(String email : emails){
            int atIndex = email.indexOf('@');
            String first = email.substring(0, atIndex);
            String last = email.substring(atIndex);
            if(first.contains("+")){
                first = first.substring(0, first.indexOf('+'));
            }

            first = first.replaceAll("\\.", "");

            uniqueEmails.add(first+last);
        }

        return uniqueEmails.size();
    }

    @Test
    void zeroEmails() {
        int unique;
        String[] testEmails = {};

        unique = numUniqueEmails(testEmails);

        assertEquals(0, unique);
    }

    @Test
    void oneEmail() {
        int unique;
        String[] testEmails = {"test.email+alex@leetcode.com"};

        unique = numUniqueEmails(testEmails);

        assertEquals(1, unique);
    }

    @Test
    void twoEmailsBothUnique() {
//        ["test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
        int unique;
        String[] testEmails = {"test.email+alex@leetcode.com","testemail+david@lee.tcode.com"};

        unique = numUniqueEmails(testEmails);

        assertEquals(2, unique);
    }

    @Test
    void twoEmailsOneUnique() {
//          ["test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
        int unique;
        String[] testEmails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com"};

        unique = numUniqueEmails(testEmails);

        assertEquals(1, unique);
    }

    @Test
    void threeEmailsTwoUnique(){
        int unique;
        String[] testEmails = {"testemail@leetcode.com","testemail1@leetcode.com","testemail+david@lee.tcode.com"};

        unique = numUniqueEmails(testEmails);

        assertEquals(3, unique);
    }
}
