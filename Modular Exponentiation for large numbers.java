class Solution {
    static long solve(long x, long n, long M) {
        if(n == 0)
            return 1;
            
        if(n == 1)
            return x % M;
            
        if(n % 2 == 0)
            return solve((x * x) % M, n / 2, M) % M;
        else
            return ((x % M) * solve((x * x) % M, n / 2, M)) % M;
    }

	public long PowMod(long x, long n, long M) {
	    return solve(x, n, M);
	}
}
