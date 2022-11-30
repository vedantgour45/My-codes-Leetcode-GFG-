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
    //Declaring the variables globally;
    
    ListNode oh; //original head
    ListNode ot; //original tail
    
    ListNode th; //temporary head;
    ListNode tt; //temporary tail;
    
    public void addFirst(ListNode nn) {
        if(th==null) {
            th = nn;
            tt = nn;
        } else {
            nn.next = th;
            th = nn;
        }
    }
    
    public int getSize(ListNode head) {
        int size = 0;
        ListNode curr = head;
        while(curr!=null) {
            curr = curr.next;
            size++;
        }
        return size;
    }
    
    public ListNode reverseKGroup(ListNode head, int k) {
        oh = null;
        ot = null;
        
        th = null;
        tt = null;
        
        ListNode curr = head;
        int size = getSize(head);  //fuction to fing the length of the LL
        
        while(size>=k) {
            int count = k;
            
            //reverse in the pair of k
            while(count>0) {
                ListNode nCurr = curr.next;
                curr.next = null;
                
                addFirst(curr);  // this will reverse the LL for k nodes as we have initialised int count = k;
                curr = nCurr;
                
                size--;
                count--;
            }
            
            //adding th & tt to original list
            if(oh==null) {
                oh = th;
                ot = tt;
            } else {
                ot.next = th;
                ot = tt;
            }
            //put the temporary variables back to null so that we can use them for next iteration freshly
            th = null;
            tt = null;
        }
        
        //adding remaing nodes of the LL
        ot.next = curr;
        
        return oh;
    }
}