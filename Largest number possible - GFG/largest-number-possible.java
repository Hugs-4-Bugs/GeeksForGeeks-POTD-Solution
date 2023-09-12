//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split("\\s+");
            int N = Integer.parseInt(a[0]);
            int S = Integer.parseInt(a[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.findLargest(N, S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static String findLargest(int N, int S){
        // code here
         if(S == 0 && N > 1){
            return "-1";
        }
        StringBuilder str = new StringBuilder();
        for(int i=0;i<N;i++){
            if(S < 10){
                str.append(S);
                S=0;
            }
            else{
                str.append(9);
                S-=9;
            }
        }
        return S == 0 ? str.toString() : "-1";
    }
}