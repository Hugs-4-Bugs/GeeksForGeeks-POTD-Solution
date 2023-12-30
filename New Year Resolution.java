class Solution {
    public static boolean isPossible(int N, int[] coins) {
        return HappyNewYear2024(coins, 0, 0);
    }
    
    static boolean HappyNewYear2024(int[] arr, int index, int sum) {
        if(index >= arr.length) {
            return sum != 0 && (sum == 2024 || sum % 20 == 0 || sum % 24 == 0);
        }
        if(sum != 0 && (sum == 2024 || sum % 20 == 0 || sum % 24 == 0)) {
            return true;
        }
        
        return HappyNewYear2024(arr, index+1, arr[index]+sum) || 
                HappyNewYear2024(arr, index+1, sum);
    }
}
        
