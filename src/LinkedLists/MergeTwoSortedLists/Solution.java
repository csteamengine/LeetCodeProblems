package LinkedLists.MergeTwoSortedLists;

import org.junit.jupiter.api.Test;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ans= new ListNode(0);
        ListNode ansTemp = ans;
        ListNode temp1 = l1;
        ListNode temp2 = l2;

        while(temp1!=null || temp2!=null){
            if(temp2 == null || temp1 != null && temp1.val<=temp2.val){
                ansTemp.next = temp1;
                temp1 = temp1.next;
            }
            else {
                ansTemp.next = temp2;
                temp2 = temp2.next;
            }
            ansTemp = ansTemp.next;
        }
        return ans.next;
    }

    @Test
    void testCase1() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(4);
        ListNode first2 = new ListNode(1);
        ListNode second2 = new ListNode(3);
        ListNode third2 = new ListNode(4);

        first.next = second;
        second.next = third;

        first2.next = second2;
        second2.next = third2;

        ListNode result = mergeTwoLists(first, first2);

        while(result.next != null){
            System.out.println(result.next.val);
            result = result.next;
        }

    }
}

