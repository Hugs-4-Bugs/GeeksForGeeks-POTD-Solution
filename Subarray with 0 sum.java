class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
     static boolean findsum(int arr[],int n) {
        //Your code here
        Set<Integer> set = new HashSet<>();
        set.add(arr[0]);
        set.add(0);
        
        for(int i=1; i<n; i++) {
            arr[i] = arr[i-1]+arr[i];
            if(set.contains(arr[i])){
                return true;
            }
            set.add(arr[i]);
        }
        
        return false;
    }
}
