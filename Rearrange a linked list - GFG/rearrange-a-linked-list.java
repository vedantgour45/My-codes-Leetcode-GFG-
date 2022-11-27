//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
    
}
class GFG{
	static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            new Solution().rearrangeEvenOdd(head);
            printList(head); 
            t--;
        }
    } 
} 

// } Driver Code Ends


/*

class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
This is method only submission.
You only need to complete the below method.
*/
class Solution
{

   // Should rearrange given linked list such that all even
   // positioned Nodes are before odd positioned.
   // Returns nothing
    void rearrangeEvenOdd(Node head)
    {
          //  The task is to complete this method
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
        
  
        curr1.next = head2;
        
        head = head1;
     }
}
