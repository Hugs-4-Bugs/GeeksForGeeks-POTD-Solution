class Solution
{
    private static final int MOD = 1000000007;

    public int TotalWays(int N)
    {
        // Code here
        if (N == 0) return 0;

        int[] withBuilding = new int[N];
        int[] withoutBuilding = new int[N];

        withBuilding[0] = 1;
        withoutBuilding[0] = 1;

        for (int i = 1; i < N; i++) {
            withBuilding[i] = withoutBuilding[i - 1];
            withoutBuilding[i] = (withBuilding[i - 1] + withoutBuilding[i - 1]) % MOD;
        }

        int totalOneSide = (withBuilding[N - 1] + withoutBuilding[N - 1]) % MOD;
        return (int)((long)totalOneSide * totalOneSide % MOD);
    }
}
