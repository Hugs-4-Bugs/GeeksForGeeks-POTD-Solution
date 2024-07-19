
class Solution {
    int[] constructLowerArray(int[] arr) {
        // code here
        int n= arr.length;
        int[] ans=new int[n];
        for(int i=0;i<n-1;i++){
             int count=0;
            for(int j=i+1;j<n;j++){
               if(arr[i]>arr[j]){
                   count++;
               }
            }
            ans[i]=count;
        }
        return ans;
    }
}
