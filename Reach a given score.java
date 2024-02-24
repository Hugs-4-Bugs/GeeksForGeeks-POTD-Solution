class Geeks {
    public long count(int n) {
        // Add your code here.
        
        //  Base case
        if(n<=1){    
            return n;
        }
       long[] dp = new long[n + 1];
        dp[0] = 1;

        long[] moves = {3, 5, 10};
       for (int j = 0; j < moves.length; j++) {
            long move = moves[j];
            for (long i = move; i <= n; i++) {
                dp[(int)i] += dp[(int)(i - move)];
            }
        }

        return dp[(int)n];
       
        
    }
}
