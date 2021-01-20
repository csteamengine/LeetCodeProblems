package AddTwoNumbers;

import org.junit.jupiter.api.Test;

public class Solution {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean remainder = false;
        ListNode l1Curr = l1;
        ListNode l2Curr = l2;
        ListNode output = new ListNode();
        while(l1Curr != null){


            l1Curr = l1Curr.next;
        }
        return new ListNode();
    }

    @Test
    void testAddTwoNumbers() {
//        ListNode
//        addTwoNumbers()
    }
}
