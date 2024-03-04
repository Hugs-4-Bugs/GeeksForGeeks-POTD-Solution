class Solution {
    public void swapElements(int[] arr, int n) {
        // Iterate through the array, swapping every ith element with (i+2)th element
        for (int i = 0; i < n - 2; i++) {
            int temp = arr[i];
            arr[i] = arr[i + 2];
            arr[i + 2] = temp;
        }
    }
}
