
// User function Template for Java
class Solution {
    int Maximize(int arr[]) {
        Arrays.sort(arr);
        long sum = 0;
        // int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            sum = (sum + ((long) arr[i] * i) % 1000000007) % 1000000007;
        }
        return (int) sum;
    }
}










// // OR CAN BE WRITTEN AS

// class Solution {
//     int Maximize(int arr[]) {
//         Arrays.sort(arr);
//         long sum = 0;
//         int n = arr.length;
//         for (int i = 0; i < n; i++) {
//             sum = (sum + ((long) arr[i] * i) % 1000000007) % 1000000007;
//         }
//         return (int) sum;
//     }
// }
