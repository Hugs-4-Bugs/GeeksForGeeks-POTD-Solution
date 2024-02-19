class Solution
{
     public static int wordBreak(String str, ArrayList<String> wordDict )
    {
        //code here
        int strLen=str.length(), arrLen=wordDict.size();

        boolean[] dp=new boolean[strLen+1];

        dp[strLen]=true;
        
        for(int i=strLen-1; i>=0; i--) {
            for(int j=0; j<arrLen; j++) {
                if(i+wordDict.get(j).length()<=strLen && str.substring(i, i+wordDict.get(j).length()).equals(wordDict.get(j))) {
                    dp[i]=dp[i+wordDict.get(j).length()];
                }

                if(dp[i]) break;
            }
        }

        if(dp[0]) return 1;
        else return 0;
    }
}
