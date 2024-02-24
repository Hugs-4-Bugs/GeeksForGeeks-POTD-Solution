class Solution {
    // Memoization array to store computed maximum sums
    static int[] memo;

    public int maxSum(int n) {
        // Initialize memoization array
        memo = new int[n + 1];
        // Call the recursive function to find the maximum sum
        return findMaxSum(n);
    }

    // Recursive function to find the maximum sum
    private int findMaxSum(int n) {
        // Base case
        if (n <= 1)
            return n;

        // Check if the maximum sum for 'n' is already computed
        if (memo[n] != 0)
            return memo[n];

        // Compute maximum sum by breaking down into parts and finding the maximum among them
        int sum = findMaxSum(n / 2) + findMaxSum(n / 3) + findMaxSum(n / 4);

        // Store the computed maximum sum in the memoization array
        memo[n] = Math.max(n, sum);

        return memo[n];
    }
}
