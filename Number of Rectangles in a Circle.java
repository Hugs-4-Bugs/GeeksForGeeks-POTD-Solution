class Solution {
    int rectanglesInCircle(int r) {
        int c = 0;

        for (int i = 1; i < 2 * r; i++) {
            int k = 1; 
            while (4 * r * r >= i * i + k * k) {
                c++; 
                k++; 
            }
        }

        return c; 
    }
}
