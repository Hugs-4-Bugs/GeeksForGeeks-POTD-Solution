//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node 
{
    int data;
    Node next;
    
    Node(int a)
        {
            data = a;
            next = null;
        }
}

class GfG
{
    static Scanner sc = new Scanner(System.in);
    
    public static Node inputList(int size)
    {
        Node head, tail;
        int val;
        
        val = sc.nextInt();
        
        head = tail = new Node(val);
        
        size--;
        
        while(size-->0)
        {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }
        
        return head;
    }
    
    public static void printList(Node n)
    {
        while(n!=null)
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    
    public static void main(String args[])
    {
        int t = sc.nextInt();
        while(t-->0)
        {
            int n , m;
            
            n = sc.nextInt();
            Node head1 = inputList(n);
            
            m = sc.nextInt();
            Node head2 = inputList(m);
            
            Sol obj = new Sol();
            
            printList(obj.findUnion(head1, head2));
            System.out.println();
        }
    }
}
// } Driver Code Ends


/*
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

public class Main {
    public static void main(String[] args) {
        // Create sample linked lists
        Node list1 = new Node(1);
        list1.next = new Node(2);
        list1.next.next = new Node(3);

        Node list2 = new Node(2);
        list2.next = new Node(3);
        list2.next.next = new Node(4);

        // Call the findUnion method
        Node result = Sol.findUnion(list1, list2);

        // Print the result
        while (result != null) {
            System.out.print(result.data + " ");
            result = result.next;
        }
    }
}

class Sol {
    public static Node findUnion(Node head1, Node head2) {
        Node cur = null, start = null;

        TreeSet<Integer> s = new TreeSet<Integer>();
        // using tree set to store numbers in sorted order

        while (head1 != null) {
            // adding all numbers in list1 to set
            s.add(head1.data);
            head1 = head1.next;
        }
        while (head2 != null) {
            // adding all numbers in list2 to set
            // duplicates will be ignored in set
            s.add(head2.data);
            head2 = head2.next;
        }
        for (Integer i : s) {
            Node ptr = new Node(i);
            if (start == null) {
                // creating new head
                start = ptr;
                cur = ptr;
            } else {
                // appending node at the end
                cur.next = ptr;
                cur = ptr;
            }
        }
        return start;
    }
}