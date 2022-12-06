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
    public ListNode oddEvenList(ListNode head) {
       ListNode dummy1 = new ListNode(-1);
       ListNode curr1 = dummy1;

       ListNode dummy2 = new ListNode(-1);
       ListNode curr2 = dummy2;

       ListNode temp = head;
       int i=0;

       while(temp!=null) {
           ListNode newTemp = temp.next;
           temp.next = null;

           if(i%2==0) {
               curr1.next = temp;
               temp = newTemp;
               curr1 = curr1.next;
           }

           if(i%2!=0) {
               curr2.next = temp;
               temp = newTemp;
               curr2 = curr2.next;
           }
           i++;
       }
       ListNode head1 = dummy1.next;
       ListNode head2 = dummy2.next;

       curr1.next = head2;
       head = head1;
       
       return head;
    }
}