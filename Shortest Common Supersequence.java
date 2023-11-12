 int dp[][] = new int[m+1][n+1]; 
        dp[0][0] = 0;
        for(int i = 1; i <= m ; i++){
            dp[i][0] = i;
        }
         for(int j = 1; j <= n ; j++){
            dp[0][j] = j;
        }
        
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(X.charAt(i-1) == Y.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                }
                else{
                    dp[i][j] = 1 + Math.min(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
       return dp[m][n];
