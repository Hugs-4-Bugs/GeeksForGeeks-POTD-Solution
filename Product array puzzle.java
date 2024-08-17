class Solution {
    public static long[] productExceptSelf(int nums[]) {
    long temp = 1;
        long c = 0; 
        int index = -1;
        for(int i = 0 ;i<nums.length;i++){
            if(nums[i]!=0) temp = temp*nums[i];
            else{
                c++;
                index = i;
            }
        }
        long ans [] = new long[nums.length];
        if(c>1) return ans;
        if(c==1){
            ans[index] = temp;
            return ans;
        }
        for(int i  =0 ; i<nums.length;i++){
            ans[i] = temp/nums[i];
        }
        return ans;
    }
}
