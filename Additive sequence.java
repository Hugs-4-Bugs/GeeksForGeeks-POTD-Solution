class Solution{
public static boolean isAdditiveSequence(String s) {
    // code here
    long first, second;
    int n = Math.min(18, s.length());
    for(int i = 0; i<n; i++){
        for(int j = i+1; j<n; j++){
            first = Long.parseLong(s.substring(0, i+1));
            second = Long.parseLong(s.substring(i+1, j+1));
            if(isAdditiveSequence(s, j+1, first, second)) return true;
        }
    }
    return false;
}

public static boolean isAdditiveSequence(String s, int st, long prev, long cur){
    int n = s.length();
    while (true){
        long sum = prev+cur;
        int len = len(sum);
        if(st+len > n){
            break;
        }
        long temp = sum;
        for(int i = len+st-1; i>= st; i--, temp /= 10){
            if(s.charAt(i) - '0' != (temp%10)) return false;
        }
        if(len+st == n) return true;
        st += len;
        prev = cur;
        cur = sum;
    }
    return false;
}

static int len(long sum){
    int res = 0;
    while (sum > 0){
        res++;
        sum /= 10;
    }
    return res;
}
}
