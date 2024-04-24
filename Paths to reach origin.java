Recursion : (TLE)

class Solution
{
    public static int ways(int n, int m)
    {
        // complete the function
        return solve(n,m);
    }
    public static int solve(int i,int j){
        if(i < 0 || j < 0){
            return 0;
        }
        if(i == 0 && j == 0){
            return 1;
        }
        int l = solve(i-1,j);
        int r = solve(i,j-1);
        return l + r;
    }
}










Memoization :

class Solution
{
    public static int ways(int n, int m)
    {
        // complete the function
        int dp[][] = new int[n+1][m+1];
        for(int i[] : dp){
            Arrays.fill(i,-1);
        }
        return solve(n,m,dp);
    }
    public static int solve(int i,int j,int dp[][]){
        if(i < 0 || j < 0){
            return 0;
        }
        if(i == 0 && j == 0){
            return 1;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int l = solve(i-1,j,dp);
        int r = solve(i,j-1,dp);
        return dp[i][j] = (l + r) % 1000000007;
    }
}










Tabulation :

class Solution
{
    public static int ways(int n, int m)
    {
        // complete the function
        int dp[][] = new int[n+1][m+1];
        
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(i == 0 && j == 0){
                    dp[i][j] = 1;
                }
                else if(i == 0){
                   dp[i][j] = dp[i][j-1];
               }
               else if(j == 0){
                   dp[i][j] = dp[i-1][j];
               }
                else{
                    dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % 1000000007;
                }
            }
        }
        return dp[n][m];
    }
    
}
