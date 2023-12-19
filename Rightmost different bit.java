class Solution
{
    //Function to find the first position with different bits.
    public static int posOfRightMostDiffBit(int m, int n)
    {
            
        // Your code here  
           for(int i=0;i<32;i++){
            if((m & (1<<i))!=(n&(1<<i))){
                return i+1;
            }
        }
        return -1;
            
    }
}


