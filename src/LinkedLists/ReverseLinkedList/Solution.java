package LinkedLists.ReverseLinkedList;

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
    ListNode(int x) { val = x; }
}

public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head; //The end

        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return p;
    }

}

