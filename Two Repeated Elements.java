class Solution
{
    //Function to find two repeated elements.
    public int[] twoRepeated(int arr[], int n)
    {
        int[] res =new int[2];
        int[] freq = new int[n+1];
        for(int a : arr){
            freq[a]++;
            if(freq[a] == 2){
                if(res[0] == 0) res[0] = a;
                else res[1] = a;
            }
        }
        return res;
    }
    
}
