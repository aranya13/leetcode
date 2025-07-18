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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode temp = head;
        int length = 1;
        while(temp.next != null){
            length++;
            temp = temp.next;
        }
        k = k%length;
        if(k == 0){
            return head;
        }
        int n = length - k;
        temp.next = head;
        temp = head;
        for(int i = 1 ; i < n ; i++){
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;

        return head;
    }
}