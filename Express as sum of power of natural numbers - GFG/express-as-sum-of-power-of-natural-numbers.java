//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] input = new String[2]; 
            input = br.readLine().split(" "); 
            int n = Integer.parseInt(input[0]); 
            int x = Integer.parseInt(input[1]); 
            Solution ob = new Solution();
            System.out.println(ob.numOfWays(n, x));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution
{
    static int numOfWays(int n, int x)
    {
        // code here
         int dp[]=new int[n+1];
        dp[0]=1;
        int mod=1000000007;
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                int y=(int)Math.pow(i,x);
                if(j>=y){
                    dp[j]=(dp[j]+dp[j-y])%mod;
                }
            }
        }
        return dp[n];
    }
}