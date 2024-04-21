class Solution {
    public void threeWayPartition(int[] array, int a, int b) {
        int n = array.length;
        int start = 0, end = n - 1;
        
        // Process elements from both ends
        for (int i = 0; i <= end;) {
            // If the current element is less than 'a', swap it with the element at 'start'
            if (array[i] < a) {
                swap(array, i, start);
                start++;
                i++;
            }
            // If the current element is greater than 'b', swap it with the element at 'end'
            else if (array[i] > b) {
                swap(array, i, end);
                end--;
            }
            // If the current element is in the range [a, b], move to the next element
            else {
                i++;
            }
        }
    }
    
    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
