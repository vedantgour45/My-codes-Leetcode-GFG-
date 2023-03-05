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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        
        int sum = 0;
        while(head!=null){
            if(head.val==0 && sum!=0){
                prev.next = new ListNode(sum);
                prev = prev.next;
                sum = 0;
            }
            sum += head.val;
            head = head.next;
        }
        return dummy.next;
    }
}