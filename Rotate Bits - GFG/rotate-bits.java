//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int d = sc.nextInt();
            
            Solution ob = new Solution();
            
            ArrayList<Integer> res = ob.rotate (n, d);
            System.out.println(res.get(0));
            System.out.println(res.get(1));
            
           
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    
   ArrayList<Integer> rotate(int n, int d)
    {
        final int bit = 16;
        ArrayList<Integer> ans = new ArrayList<>();
        d = d%16;
        //for left rotate :
        int rLeft = ((n<<d) | (n >> (bit-d) ) ) & 0xFFFF ;
        
        //for right shift : 
        
        int rRight = ((n>>d) | (n << (bit-d) ) ) & 0xFFFF;
        
        ans.add(rLeft);
        ans.add(rRight);
        
        return ans;
    }
}