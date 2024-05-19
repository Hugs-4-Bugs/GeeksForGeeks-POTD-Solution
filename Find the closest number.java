class Solution {
    public static int findClosest(int n, int k, int[] arr) {
        
        for(int i=0;i<arr.length;i++){
            if(k<=arr[i]){
                if(i==0)return arr[i];
                else{
                    if(k==arr[i])return arr[i];
                    else{
                        int x=Math.abs(k-arr[i]);
                        int y=Math.abs(k-arr[i-1]);
                        if(x>y)return arr[i-1];
                        else if(x<=y)return arr[i];
                    }
                }
            }
            
        }
        return arr[n-1];
    }
}
