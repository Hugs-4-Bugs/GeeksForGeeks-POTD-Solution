// User function Template for Java
class Solution {
    static String armstrongNumber(int n) {
        // code here
           int s=n;
    int s1=0;
    while(n>0){
        int si=n%10;
        s1+=(int)Math.pow(si,3);
        n/=10;
    }
     return s==s1?"true":"false";


    }
}
