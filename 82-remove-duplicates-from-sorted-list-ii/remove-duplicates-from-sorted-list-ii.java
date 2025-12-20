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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        if(temp == null || temp.next == null) return temp;
        if(temp.val == temp.next.val){
            int val = temp.val;
            while(temp != null && temp.val == val){
                temp = temp.next;
            }
            return deleteDuplicates(temp);
        }
        temp.next = deleteDuplicates(temp.next);
        return temp;
    }
}