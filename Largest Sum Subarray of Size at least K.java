class Solution {
    public long maxSumWithK(long a[], long n, long k) {
        long[] maxSum = new long[(int)n];
        maxSum[0] = a[0];

        long curr_max = a[0];
        for (int i = 1; i < n; i++) {
            curr_max = Math.max(a[i], curr_max + a[i]);
            maxSum[i] = curr_max;
        }

        long sum = 0;
        for (int i = 0; i < k; i++) {
            sum += a[i];
        }

        long result = sum;
        for (int i = (int)k; i < n; i++) {
            sum = sum + a[i] - a[i - (int)k];

            result = Math.max(result, sum);

            result = Math.max(result, sum + maxSum[i - (int)k]);
        }

        return result;
    }
}
