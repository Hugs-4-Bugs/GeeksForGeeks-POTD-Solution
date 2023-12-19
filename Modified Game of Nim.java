class Solution{
    static int findWinner(int n, int A[]){
        // code here
         int xor = 0;
        for (int num : A) {
            xor ^= num;
        }
        if (xor == 0 || n % 2 == 0) {
            return 1;
        } else {
            return 2;
        }
    }
}
