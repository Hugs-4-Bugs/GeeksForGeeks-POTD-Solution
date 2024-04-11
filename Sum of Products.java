class Solution {
    static long pairAndSum(int n, long arr[]) {
        long result = 0; // Initialize result to store the sum
        
        // Iterate through each bit position from 0 to 31
        for (int bit = 0; bit < 32; bit++) {
            long count = 0; // Initialize count to count the number of elements with the bit set
            
            // Count the number of elements with the bit set at position 'bit'
            for (int i = 0; i < n; i++) {
                if ((arr[i] & (1L << bit)) != 0) { // Check if the bit is set
                    count++;
                }
            }
            
            // Add the contribution of the current bit to the result
            result += (count * (count - 1) / 2) * (1L << bit); // count choose 2 * 2^bit
        }
        
        return result;
    }
}
