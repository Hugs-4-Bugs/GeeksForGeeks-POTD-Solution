class Solution {
    
    public boolean countSub(long arr[], long n)
    {
        int i=1;
        for(long k:arr){
            for(int j=0;j<2&&i<n;j++){
                if(arr[i]>k){
                    return false;
                }
                i++;
            }
        }
        return true;
    }
}

