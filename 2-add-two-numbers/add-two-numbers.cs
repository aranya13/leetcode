/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
public class Solution {
    public ListNode AddTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy_head = new ListNode();
        ListNode tail = dummy_head;
        int c =0;
        while(l1 != null || l2 != null || c != 0){
            int d1 = (l1 != null) ? l1.val : 0;
            int d2 = (l2 != null) ? l2.val : 0;
            int sum = d1 + d2 + c;
            int digit = sum % 10;
            c = sum/10;

            ListNode newnode = new ListNode(digit);
            tail.next = newnode;
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;

        }
        ListNode result = dummy_head.next;
        dummy_head = null;
        return result;

    }
}