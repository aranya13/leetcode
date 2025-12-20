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
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0);
        ListNode large = new ListNode(0);
        ListNode sp = small;
        ListNode lp  = large;

        while(head != null){
            if(head.val < x){
                sp.next = head;
                sp =  sp.next;
            }
            else{
                lp.next = head;
                lp =  lp.next;
            }
            head = head.next;
        }
        sp.next = large.next;
        lp.next = null;
        return small.next;
    }
}