//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int n = sc.nextInt();
            String[] arr = new String[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.next();
            }
            
            int k = Integer.parseInt(sc.next());
            
            String str = sc.next();
            
            Solution obj = new Solution();
            int ans = obj.klengthpref(arr,n,k,str);
            System.out.println(ans);
            
            t--;
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    public int klengthpref(String[] arr, int n, int k, String str)
    {
        // code here
          Node root = new Node(0); 
  
        for (int i = 0; i < n; i++) 
        {
            root = insert(arr[i], root); 
        
        }
        
        return find(str,k,root);
    }
    public Node insert(String s, Node root) 
    { 
        int in=0; 
        Node cur = root; 
        for (int i = 0; i < s.length(); i++) { 
            in = s.charAt(i) - 'a'; 
      
            // If there is no node created then create one 
            if (cur.arr[in] == null) 
                cur.arr[in] = new Node(0); 
      
            // Increase the frequency of the node 
            cur.arr[in].freq++; 
      
            // Move to the next node 
            cur = cur.arr[in]; 
        } 
      
        // Return the updated root 
        return root;  
    } 
    public int find(String s, int k, Node root) 
    { 
        int in=0, count = 0; 
        Node cur = root; 
      
        // Traverse the string 
        for (int i = 0; i < s.length(); i++) { 
            in = s.charAt(i) - 'a'; 
      
            // If there is no node then return 0 
            if (cur.arr[in] == null) 
                return 0; 
      
            // Else traverse to the required node 
            cur = cur.arr[in]; 
      
            count++; 
      
            // Return the required count 
            if (count == k) 
                return cur.freq; 
        } 
        return 0; 
    } 
      
}
class Node
{
    Node arr[];
    int freq;
    public Node(int f)
    {
        arr=new Node[26];
        freq=f;
    }
}