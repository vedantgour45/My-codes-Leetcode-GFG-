//{ Driver Code Starts
import java.util.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Rearr
{
    static Node head;
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  =sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node temp = head;
            for(int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                temp.next = new Node(a);
                temp = temp.next;
            }
            
            Solution ob = new Solution();
            ob.rearrange(head);
            printLast(head);
            System.out.println();
        }
    }
    
    public static void printLast(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
// } Driver Code Ends


/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key) {
        data = key;
        next = null;
    }
}*/
class Solution {
     public static Node reverseList(Node head) {
        if(head == null || head.next==null) {
            return head;
        }
        Node prev = null;
        Node curr = head;
        Node next;
        while(curr!=null) {
            next = curr.next;
            curr.next = prev;
            
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static void rearrange(Node head) {
        // add your code here
        int count = 0;
        Node dummy1 = new Node(-1);
        Node curr1 = dummy1;
        
        Node dummy2 = new Node(-1);
        Node curr2 = dummy2;
        
        Node temp = head;
        
        while(temp!=null) {
            Node newtemp = temp.next;
            temp.next = null;
            
            if(count%2==0) {
                curr1.next = temp;
                temp = newtemp;
                curr1 = curr1.next;
            } else {
                curr2.next = temp;
                temp = newtemp;
                curr2 = curr2.next;
            }
            count++;
        }
        Node head1 = dummy1.next;
        Node head2 = dummy2.next;
        
        head2 = reverseList(head2);
        curr1.next = head2;
        
        head = head1;
    }
}
