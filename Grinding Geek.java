class Solution {
    public int max_courses(int n, int total, int[] cost) {
        // code here
          int[][] dp = new int[n][total + 1];
        for(int[] arr : dp) Arrays.fill(arr, -1);
        return helper(cost, total, 0, dp);
    }
    
    private int helper(int[] arr, int total, int ind, int[][] dp) {
        if(ind == arr.length) return 0;
        if(dp[ind][total] != -1) return dp[ind][total]; 
        int notTake = helper(arr, total, ind + 1, dp);
        int take = 0;
        if(arr[ind] <= total) {
            int redeem = (int) Math.floor(arr[ind] * 0.9);
            take = 1 + helper(arr, total - arr[ind] + redeem, ind + 1, dp);
        }
        return dp[ind][total] = Math.max(notTake, take);
    }
}

