class Solution
{
    public int findWinner(int n,int x,int y)
    {

        int[] dp = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        
        for(int i =2;i<=n;i++){
            //geek can reach n in x, y or 1 step:
            if( (i>=y && dp[i-y]==0) || (i>=x && dp[i-x]==0 ) || dp[i-1]==0) dp[i]=1;
        }
        
        return dp[n];
    }
}
