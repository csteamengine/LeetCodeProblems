package MergeInBetweenLinkedLists;

import org.junit.jupiter.api.Test;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode start = list1;
        for(int i = 1; i < a; i++){
            start = start.next;
        }

        ListNode end = start;
        for (int i = a; i <= b; i++) {
            end = end.next;
        }

        start.next = list2;
        while (list2.next != null) {
            list2 = list2.next;
        }

        list2.next = end.next;
        return list1;
    }

    @Test
    void testClimbStairs() {
    }
}
