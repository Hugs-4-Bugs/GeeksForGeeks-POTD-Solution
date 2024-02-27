class Solution{
    
   
    // Function for finding maximum and value pair
    public static int[] game_with_number (int arr[], int n) {
        // Complete the function
            for(int i=1;i<n;i++)  arr[i - 1] |= arr[i];
        return arr;
        
    }
    
    
}



