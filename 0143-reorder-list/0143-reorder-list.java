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
        //get the middle of the LL
        ListNode middle = getMiddle(head);
        
        //break LL into 2 parts
        ListNode head2 = middle.next;
        middle.next = null;
        
        //reverse the 2nd part(LL)
        head2 = reverse(head2);
        
        //top reorder, merge the lists
        head = merge(head, head2);
    }
    
    //to find the middle
    public ListNode getMiddle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next!=null && fast.next.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    
    //to reverse 2nd part LL
    public ListNode reverse(ListNode head2) {
        ListNode prev = null;
        ListNode curr = head2;
        ListNode next;
        while(curr!=null) {
            next = curr.next;
            curr.next = prev;
            
            prev = curr;
            curr = next;
        }
        return prev;
    }
    
    //merge them alternately
    public ListNode merge(ListNode head1, ListNode head2) {
        ListNode dummy = new ListNode(-1);
        ListNode p1 = head1;
        ListNode p2 = head2;
        ListNode curr = dummy;
        
        while(p1!=null && p2!=null) {
            ListNode np1 = p1.next;
            p1.next = null;
            
            ListNode np2 = p2.next;
            p2.next = null;
            
            //first LL
            curr.next = p1;
            p1 = np1;
            curr = curr.next;
            
            //second LL
            curr.next = p2;
            p2 = np2;
            curr = curr.next;
        }
        
        if(p1==null) {
            curr.next = p2;
        }
        if(p2==null) {
            curr.next = p1;
        }
        
        return dummy.next;
    }
}