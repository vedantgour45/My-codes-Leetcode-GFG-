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
        //if the LL has only one element and we have to delete that;
        if(head.next==null){
            return null;
        }
        
        //calculating size of the LL
        int size = 0;
        ListNode curr = head;
        while(curr != null){
            curr = curr.next;
            size++;
        }
        
        //if size and the element to be deleted are same
        if(n==size){
            return head.next;
        }
        
        //reaching to the previous node of the node which we want to delete
        int pointer = size-n;
        ListNode prev = head;
        int i=1;
        while(i<pointer){
            prev = prev.next;
            i++;
        }
        
        prev.next = prev.next.next;
        return head;
    }
}