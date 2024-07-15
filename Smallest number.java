class Solution {
    public String smallestNumber(int s, int d) {
        // code here
        int val = (int)Math.pow(10, d-1);
        int n = val*10;
        for(int i=val; i<n; i++) {
            if(sum(i, s)) return String.valueOf(i);
        }
        return "-1";
    }
    
    private boolean sum(int val, int s) {
        int temp = 0;
        while(val>0) {
            temp += val%10;
            val = val/10;
        }
        
        return temp == s;
    }
}
