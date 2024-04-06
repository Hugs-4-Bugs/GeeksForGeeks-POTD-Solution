class Solution {
    // Function to count number of ways to reach the nth stair
    // when order does not matter.
    Long countWays(int n) {
        // your code here
        if(n<2) return (long)n;
        long[] dp = new long[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3;i<=n;i++){
            dp[i] = Math.max(dp[i-2]+1, dp[i-1]);
        }
        return dp[n];
    }
}
