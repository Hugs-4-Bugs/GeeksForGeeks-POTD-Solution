class Solution {
    int[][] rotateMatrix(int k, int mat[][]) {
        k = k%mat[0].length;
        for(int x[] : mat){
            rotate(x, k);
        }
        return mat;
    }
    
    void rotate(int[] arr, int k){
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
        reverse(arr, 0, arr.length-1);
    }
    
    void reverse(int[] arr, int i, int j){
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
    }
}
