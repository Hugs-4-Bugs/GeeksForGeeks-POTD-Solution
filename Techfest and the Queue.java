class Solution {
    static void createsieve(long []seive,long b){
        for(int i = 2;i<=b;i++){
            seive[i] = i;
        }
        for(int i = 2;i*i<=b;i++){
            if(seive[i]==i){
            for(int j = 2*i;j<=b;j+=i){
                if(seive[j]==j){
                    seive[j]=i;
                }
            }
            }
        }
    }
    public static long sumOfPowers(long a, long b) {
        long sieve[] = new long[(int)b+1];
        createsieve(sieve,b);
        long c = 0;
        long p =a;
        while(p<=b){
        long i = p;
        while(i!=1){
        long x = sieve[(int)i];
        i=i/x;
        c++;
        }
        p++;
        }
        return c;
    }
}
