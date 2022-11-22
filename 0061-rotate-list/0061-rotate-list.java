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
        //base cases
        if(head==null || head.next==null) {
            return head;
        }
        //we need to go to the last node of our LL and at the same time we calculate size ofLL
        int size = 1;
        ListNode curr = head;
        while(curr.next!=null) {
            curr = curr.next;
            size++;
        }
        //now we are standing at last node
        //connect the last node to the head
        curr.next = head;
        
        //loop for k times and move the curr;
        k %= size;
        int times = size-k;
        while(times>0) {
            curr = curr.next;
            times--;
        }
        //now we are standing at prev node of the node of which we need to delete the connction
        head = curr.next;
        curr.next = null;
        
        return head;
    }
}