package LinkedLists.PalindromeLinkedList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null) return true;
        if(head.next == null) return true;
        ArrayList<Integer> temp = new ArrayList<>();
        while(head != null){
            temp.add(head.val);
            head = head.next;
        }

        //Loop through array list and see if integer
        int left = 0;
        int right = temp.size()-1;

        while(left < right){
            System.out.format("Left: %d -- Right: %d", temp.get(left), temp.get(right));
            System.out.println();
            if((int) temp.get(left) != (int) temp.get(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    @Test
    void testCase1() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(2);
        ListNode fourth = new ListNode(1);


        first.next = second;
        second.next = third;
        third.next = fourth;

        assertTrue(isPalindrome(first));
    }

    @Test
    void testCase2() {
        ListNode first = new ListNode(1);
        first.next = new ListNode(2);

        assertFalse(isPalindrome(first));
    }

    @Test
    void testCase3() {
        ListNode first = new ListNode(1);

        assertTrue(isPalindrome(first));
    }

    @Test
    void testCase4() {
        assertTrue(isPalindrome(null));
    }

    @Test
    void testCase5() {
        ListNode first = new ListNode(-129);
        first.next = new ListNode(-129);

        assertTrue(isPalindrome(first));
    }
}

