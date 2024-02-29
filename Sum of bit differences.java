class Solution {
    long sumBitDifferences(int[] arr, int n) {
        long pairsDiffBits = 0;
        for(int i=0;i<32;i++){
            long ones = 0;
            for(int j=0;j<n;j++){
                if((arr[j]&1)==1)
                    ones++;
                arr[j]>>=1;
            }
            pairsDiffBits += ones * (n-ones);
        }
        return pairsDiffBits*2;
    }
}
