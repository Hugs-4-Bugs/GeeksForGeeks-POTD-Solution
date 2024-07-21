class Solution {
    public long findMaxProduct(List<Integer> arr) {
        // code here
        long result = 1;
        int n = arr.size();
        int zeroes = 0;
        int maxi = Integer.MIN_VALUE;
        int mod = 1000000007;
        if(n == 1) return arr.get(0)%mod;
        if(n == 2){
            if(arr.get(0) == 0 && arr.get(1) < 0) return 0;
            else if(arr.get(0) < 0 && arr.get(1) == 0) return 0;
        }
        for(int i =0; i<n; i++){
            if(arr.get(i) != 0){
                result = (result * arr.get(i))%mod;
                if(arr.get(i) < 0) maxi = Math.max(maxi, arr.get(i));
            }
            else zeroes++;
            
        }
        if(zeroes == n) return 0;
        if(result < 0) result = result/maxi;
        return result % mod;
    }
}
