class Solution
{
    public int nthPoint(int n)
    {
        // Code here
          int MOD = 1000000007; 
        if(n==1 || n==2 || n==3) return n;
        int a = 2, b=3, c=0;
        for(int i=4; i<=n; i++){
            c = (a+b)%MOD;
            a=b;
            b = c;
        }
        return b%MOD;
    }
}
