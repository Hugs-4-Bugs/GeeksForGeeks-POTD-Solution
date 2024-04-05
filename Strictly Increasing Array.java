class Solution
{
    public int min_operations(int []nums)
    {
        // Code here
        
         int n = nums.length ;
         int dp[] = new int[n] ;
         
         Arrays.fill( dp , 1 ) ;
         
         int lis = 1 ;
         
         for( int i = 1 ; i < n ; i++ )
         {
             for( int j = 0 ; j < i ; j++ )
             {
                 if( nums[i] - nums[j] >= i - j ) 
                 {
                     dp[i] = Math.max( dp[i] , dp[j] + 1 ) ;
                 }
             }
             
             lis = Math.max( lis , dp[i] ) ;
         }
         
        //  System.out.println(lis) ;
         
         return n - lis ;
    }
}
