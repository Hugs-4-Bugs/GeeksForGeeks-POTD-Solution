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
            String line1[] = in.readLine().trim().split("\\s+");
            int N = Integer.parseInt(line1[0]);
            int W = Integer.parseInt(line1[1]);
            String line2[] = in.readLine().trim().split("\\s+");
            int val[] = new int[N];
            for(int i = 0;i < N;i++)
                val[i] = Integer.parseInt(line2[i]);
            String line3[] = in.readLine().trim().split("\\s+");
            int wt[] = new int[N];
            for(int i = 0;i < N;i++)
                wt[i] = Integer.parseInt(line3[i]);
                
            Solution ob = new Solution();
            System.out.println(ob.knapSack(N, W, val, wt));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int dp[][];
    static int helper(int curr,int tar,int val[],int wt[])
    {
        if(curr==-1)
            return 0;
        if(dp[curr][tar]!=-1)
            return dp[curr][tar];
        int ans=0;
        if(tar>=wt[curr])
            ans=helper(curr,tar-wt[curr],val,wt)+val[curr];
        ans=Math.max(ans,helper(curr-1,tar,val,wt));
        return dp[curr][tar]=ans;
    }
    static int knapSack(int N, int W, int val[], int wt[])
    {
        dp=new int[N][W+1];
        for(int x[]:dp)
            Arrays.fill(x,-1);
        return helper(N-1,W,val,wt);
    }
}
