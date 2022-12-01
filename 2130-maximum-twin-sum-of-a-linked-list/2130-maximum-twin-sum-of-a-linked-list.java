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
    public int pairSum(ListNode head) {
        //base case
        if(head.next.next==null) {
            return head.val+head.next.val;
        }
        //finding middle oo the LL
        ListNode middle = findMiddle(head);
        
        ListNode head1 = head;
        
        //reverse the second half of the LL
        ListNode head2 = reverseList(middle.next);
        
        //break the LL in two parts
        middle.next = null;
        
        int max = Integer.MIN_VALUE;
        while(head1!=null && head2!=null) {
            int currSum = head1.val+head2.val;
            max = Math.max(max, currSum);
            
            head1 = head1.next;
            head2 = head2.next;
        }
        return max;
    }
    
    public ListNode findMiddle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;
        
        while(curr!=null) {
            next = curr.next;
            curr.next = prev;
            
            prev = curr;
            curr = next;
        }
        return prev;
    }
}