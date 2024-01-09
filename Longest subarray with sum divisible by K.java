class Solution {
   int longSubarrWthSumDivByK(int a[], int n, int k) {
       // Initialize a HashMap to store remainders and their indices
       HashMap<Integer, Integer> map = new HashMap<>();

       // Insert a (0, -1) pair to handle the case where the first element itself is divisible by K
       map.put(0, -1);

       int sum = 0; // Initialize sum to 0
       int maxLen = 0; // Initialize maximum length to 0

       // Iterate through the array
       for (int i = 0; i < n; i++) {
           // Add the current element to the sum
           sum += a[i];

           // Check if the remainder is already present in the map
           int rem = (sum % k + k) % k; // Handle negative remainders
           if (map.containsKey(rem)) {
               // Update the maximum length if required
               maxLen = Math.max(maxLen, i - map.get(rem));
           } else {
               // If not present, insert the remainder and its index
               map.put(rem, i);
           }
       }

       // Return the maximum length
       return maxLen;
   }
}
