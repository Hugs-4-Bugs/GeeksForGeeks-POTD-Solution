class Solution{
     static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here
        int i=0, j=0;
        long sum = 0, ans = 0;
        while(j < N) {
            if(j-i < K) {
                sum+=Arr.get(j);
                ans = Math.max(ans, sum);
                j++;
            } else {
                sum-=Arr.get(i);
                i++;
            }
        }
        
        return ans;
    }
}
    
