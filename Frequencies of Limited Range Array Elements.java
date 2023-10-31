class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
   public static void frequencyCount(int arr[], int N, int P) {
    P++;
    for (int i = 0; i < N; i++) {
        int index = (arr[i] % P) - 1;
        if (index >= 0 && index < N) {
            arr[index] += P;
        }
    }

    for (int i = 0; i < N; i++) {
        arr[i] = arr[i] / P;
    }
}

}
