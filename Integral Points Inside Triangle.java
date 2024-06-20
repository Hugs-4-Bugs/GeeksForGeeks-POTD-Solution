class Solution {
    long InternalCount(long p[], long q[], long r[]) {
        // code here
        long area = Math.abs(p[0] * (q[1] - r[1]) + q[0] * (r[1] - p[1]) + r[0] * (p[1] - q[1]))/2;
        long b1 = gcd(Math.abs(p[0]-q[0]), Math.abs(p[1]-q[1]));
        long b2 = gcd(Math.abs(q[0]-r[0]), Math.abs(q[1]-r[1]));
        long b3 = gcd(Math.abs(p[0]-r[0]), Math.abs(p[1]-r[1]));
        long bp = b1+b2+b3;
        return area + 1 - (bp/2);
        
    }
    
    long gcd(long a, long b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }
};
