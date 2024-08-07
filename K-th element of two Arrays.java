class Solution {
    public long kthElement(int k, int arr1[], int arr2[]) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            arr.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            arr.add(arr2[i]);
        }
        Collections.sort(arr);
        
        return arr.get(k-1);
        
    }
}
