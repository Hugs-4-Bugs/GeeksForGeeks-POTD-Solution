//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class Node
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
    }
}
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());

        while (t-- > 0) {
            int n=Integer.parseInt(in.readLine().trim());
            String s[]=in.readLine().trim().split(" ");
            Node head=new Node(Integer.parseInt(s[0]));
            Node copy=head;
            for(int i=1;i<n;i++){
                Node temp=new Node(Integer.parseInt(s[i]));
                copy.next=temp;
                copy=copy.next;
            }
            Solution ob=new Solution();
            Node ans=ob.modifyTheList(head);
            while(ans!=null){
                out.print(ans.data+" ");
                ans=ans.next;
            }out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    public static Node modifyTheList(Node head)
    {
        if(head.next==null)
        return head;
        Node slow=head,fast=head,mid;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        mid=slow;
        Node reversedList=mid.next;
        mid.next=null;
        reversedList=reverse(reversedList);
        Node temp2=reversedList,temp=head;
        while(temp2!=null)
        {
            int x=temp.data;
            temp.data=temp2.data-x;
            temp2.data=x;
            temp=temp.next;
            temp2=temp2.next;
        }
        mid.next=reverse(reversedList);
        return head;
    }
    public static Node reverse(Node head)
    {
        Node prev=null;
        while(head!=null)
        {
            Node nxt=head.next;
            head.next=prev;
            prev=head;
            head=nxt;
        }
        return prev;
    }
}