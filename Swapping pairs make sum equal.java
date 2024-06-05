class Solution
{
    long findSwapValues(long A[], int n, long  B[], int m)
    {
        long sum1 = 0;
        
        for (int i = 0; i < n; i++) {
            sum1 += A[i];
        }
        
        long sum2 = 0;
        HashMap<Long, Integer> map = new HashMap<>();
        
        for (int i = 0; i < m; i++) {
            sum2 += B[i];
            map.put(B[i], 1);
        }
        
        for (int i = 0; i < n; i++) {
            long bi = (sum2 - sum1)/2 + A[i];
            
            if ((sum2 - sum1)%2 == 0 && map.containsKey(bi)) {
                return 1;
            }
        }
        
        return -1;
    }
}
