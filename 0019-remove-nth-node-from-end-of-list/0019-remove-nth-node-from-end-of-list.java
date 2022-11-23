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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        ListNode p1 = dummy;
        ListNode p2 = dummy;
        dummy.next = head;
        
        while(n >= 0 && p2!=null) {
            p2 = p2.next;
            n--;
        }
        while(p2!=null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        
        p1.next = p1.next.next;
        
        return dummy.next;
    }
}