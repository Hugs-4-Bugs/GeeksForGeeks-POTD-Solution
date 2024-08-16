class Solution
{
    //Function to find the maximum number of cuts.
    public int maximizeCuts(int n, int x, int y, int z)
    {
        int dp[] = new int[n+1];
        List<Integer> list = new ArrayList<>( Arrays.asList(x,y,z) );
        // System.out.println(list);
       
        for(Integer val:list){
            for(int i=val;i<=n;i++){
                if(i-val==0 || dp[i-val]>0)     dp[i] = Math.max(dp[i],1+dp[i-val]);
            }
        }
        return dp[n];
    }
}
