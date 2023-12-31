class Solution {
    public boolean canPair(int[] nums, int k) {
       
        int[] arr=new int[k];  
        for(int i=0;i<nums.length;i++)
        {
            arr[nums[i]%k]++;
        }
        if((arr[0]%2)!=0 )
        {
            return false;
        }
        if(k%2==0)
        {
            if(arr[k/2]%2!=0) return false;
            else
            {
                for(int i=1;i<k/2;i++)
                 {
                    if(arr[i]!=arr[k-i]) return false;
                 }
            }
        }
        else
        {
            for(int i=1;i<=k/2;i++)
             {
                if(arr[i]!=arr[k-i]) return false;
             }
        }
        
        return true;
    }
}
