class Solution{
    public int minStep(int n)
    {
        // code here
        int j = n, ans = 0; 
        while(j > 1){
            if(j % 3 == 0){
                j = j/3;
                
            } else j--;
            ans++;
        }
        return ans;
    }
}
