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
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        
        int carry = 0;
        
        while(l1 != null || l2 != null || carry == 1){
            
            int sum = 0;
            
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            
            sum += carry;
            
            // I should store sum % 10 in my new ListNode
            // Store (sum / 10) in carry variable for next iteration
            carry = sum / 10;
            ListNode n = new ListNode(sum % 10);

            // Add it next to curr ListNode
            curr.next = n;
            curr = curr.next;
        }
        
        return dummy.next;
    }
}

