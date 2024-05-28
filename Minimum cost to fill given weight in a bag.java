class Solution {
    public static int minimumCost(int n, int w, int[] cost) {
        // Create a dp array to store the minimum cost to buy exactly i kg of oranges
        int[] dp = new int[w + 1];
        
        // Initialize dp[0] to 0 (0 cost to buy 0 kg)
        dp[0] = 0;
        
        // Initialize other dp values to infinity (representing impossible initially)
        for (int i = 1; i <= w; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        
        // Fill the dp array
        for (int i = 1; i <= w; i++) {
            for (int j = 1; j <= n; j++) {
                // Only consider valid packets (cost[j-1] != -1)
                if (j <= i && cost[j-1] != -1 && dp[i - j] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - j] + cost[j-1]);
                }
            }
        }
        
        // If dp[w] is still infinity, it means it's impossible to buy exactly w kg
        return dp[w] == Integer.MAX_VALUE ? -1 : dp[w];
    }
}
