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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode t1 = head;
        ListNode t2 = head.next;
        ListNode t3 = head.next.next;

        t1.next = t3;
        t2.next = t1;
        head = t2;
        ListNode temp = head.next;

        while(temp != null && temp.next != null && temp.next.next != null){
        ListNode a = temp;
        ListNode b = temp.next;
        ListNode c = temp.next.next;
        ListNode d = temp.next.next.next;

        a.next = c;
        b.next = d;
        c.next = b;
        temp = temp.next.next;
        }
        return head;
    }
}