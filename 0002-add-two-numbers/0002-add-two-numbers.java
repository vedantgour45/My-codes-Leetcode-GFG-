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
// class Solution {
//     public static ListNode addTwoNumbers(ListNode head1, ListNode head2) {
//         ListNode l1 = reverse(head1);
//         ListNode l2 = reverse(head2);

//         ListNode dummy = new ListNode(-1);
//         ListNode temp = dummy;
//         int sum = 0, carry = 0;
//         while(l1 != null || l2 != null){
//             sum = sum/10;
//             if(l1 != null){
//                 sum += l1.val;
//                 l1 = l1.next;
//             }
//             if(l2 != null){
//                 sum += l2.val;
//                 l2 = l2.next;
//             }
//             sum += carry;
//             // I should store sum % 10 in my new ListNode
//             // Store (sum / 10) in carry variable for next iteration
//             carry = sum / 10;
//             ListNode n = new ListNode(sum % 10);

//             // Add it next to temp ListNode
//             temp.next = n;
//             temp = temp.next;
//         }
//         if(carry > 0) {
//             ListNode n = new ListNode(carry);
//             temp.next = n;
//         }
        
//         return dummy.next;
        
//     }
//     public static ListNode reverse(ListNode head) {
//         ListNode prevNode = null;
//         ListNode currNode = head;
//         ListNode nextNode;
        
//         while(currNode!=null){
//             nextNode = currNode.next;
//             currNode.next = prevNode;
            
//             prevNode = currNode;
//             currNode = nextNode;
//         }
//         return prevNode;
//     }
// }

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode c1 = l1;
        ListNode c2 = l2;
        ListNode sentinel = new ListNode(0);
        ListNode d = sentinel;
        int sum = 0;
        while (c1 != null || c2 != null) {
            sum /= 10;
            if (c1 != null) {
                sum += c1.val;
                c1 = c1.next;
            }
            if (c2 != null) {
                sum += c2.val;
                c2 = c2.next;
            }
            d.next = new ListNode(sum % 10);
            d = d.next;
        }
        if (sum / 10 == 1)
            d.next = new ListNode(1);
        return sentinel.next;
    }
}
