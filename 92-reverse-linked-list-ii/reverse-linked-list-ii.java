/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dh = new ListNode(0);
        dh.next = head;
        ListNode prev = dh;
        
        for(int i = 0 ; i < left - 1; i++){
            prev = prev.next;
        }
        ListNode curr = prev.next;

        for(int i = 0 ; i < right - left ; i++){
            ListNode temp = curr.next;
            curr.next = temp.next;
            temp.next = prev.next;
            prev.next = temp;
        }
        return dh.next;


    }
}