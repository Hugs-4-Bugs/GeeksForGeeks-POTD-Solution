//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*; 
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
    		System.out.println (new Solution().colName (n));
        }
        
    }
}

// Contributed By: Pranay Bansal 

// } Driver Code Ends


//User function Template for Java

class Solution
{
    String colName (long n)
    {
        // your code here
        StringBuilder ans=new StringBuilder();
        while(n>0){
            n--;  // reducing it to 1 so that we would get correct output
            ans.append((char)((n%26)+'A'));
            n/=26;
        }
        return ans.reverse().toString();   // reversing it to correct output
    }
}