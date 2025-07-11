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
    public void reorderList(ListNode head) {
        if(head == null) return;

        ListNode slow = head;
        ListNode fast = head;

        while(fast!= null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = slow.next;
        slow.next = null;
        ListNode node = null;

        while(second != null){
            ListNode temp = second.next;
            second.next = node;
            node = second;
            second = temp;
        }

        ListNode first = head;
        second = node;
        while(second != null){
            ListNode temp1 = first.next , temp2 = second.next;
            first.next = second;
            second.next = temp1;
            first = temp1;
            second = temp2;
        }
    }
}