class Solution {
    static long sumMatrix(long n, long q) {
        if(q>2*n||q<2)
        return 0;
        
        if(q+1<=n)
        return q-1;
        
        //n+1<q<2n
        return 2*n-q+1;
    }
}
