class Solution {
    long max_sum(int a[], int n) {
        // Your code here
         long sum = 0;
        long totalSum = 0;

        // Ensure val is of type long to prevent overflow
        long val;
        for (int i = 0; i < n; i++) {
            val = i;
            sum += a[i];
            totalSum += val * a[i];
        }
        long max = totalSum;

        // N*a[n-i] will not cause overflow
        long N = n;

        for (int i = 1; i < n; i++) {
            totalSum = totalSum + sum - N * a[n - i];
            max = Math.max(max, totalSum);
        }
        return max;
    }
}
