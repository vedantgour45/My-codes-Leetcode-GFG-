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
        //we need to go to the last node of our LL and at the same time we calculate size of LL
        int size = 0;
        ListNode curr = head;
        while(curr.next!=null) {
            curr = curr.next;
            size++;
        }
        //now we are standing at last node
        //connect the last node to the head
        curr.next = head;
        
        //loop for k times and move the curr;
        curr = head;
        k = k%(size+1); // to ensure that k is not greater that size
        int jumps = size-k;
        while(jumps>0) {
            curr = curr.next;
            jumps--;
        }
        //now we are standing at prev node of the node of which we need to delete the connction
        ListNode ansHead = curr.next;
        curr.next = null;
        
        return ansHead;
    }
}