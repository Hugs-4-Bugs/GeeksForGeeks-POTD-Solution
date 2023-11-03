class Solution {
    int transitionPoint(int arr[], int n) {
        // Check if the array does not contain any 1.
        if (arr[0] == 0 && arr[n - 1] == 0) {
            return -1;
        }

        // Check if the array does not contain any 0.
        if (arr[0] == 1) {
            return 0;
        }

        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == 1) {
                // Look in the left subarray for the transition point.
                high = mid - 1;
            } else {
                // arr[mid] == 0, look in the right subarray.
                // Check if the next element is 1; if yes, return the index.
                if (arr[mid + 1] == 1) {
                    return mid + 1;
                }
                low = mid + 1;
            }
        }

        return -1; // No transition point found (array contains all 0s).
    }
}
