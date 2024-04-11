class Solution{
    
    // function to convert a given Gray equivalent n to Binary equivalent.
    public static int grayToBinary(int n) {
        
        // Your code here
          int[] bin = new int[32];
        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0) {
                bin[i] = 1;
            }
        }
        int ans = bin[31];
        for (int i = 30; i >= 0; i--) {
            bin[i] = bin[i+1] ^ bin[i];
            ans = ans * 2 + bin[i];
        }
        return ans;
        
    }
       
}
