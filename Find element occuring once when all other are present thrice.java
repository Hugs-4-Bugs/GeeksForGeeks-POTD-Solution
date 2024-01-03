class Solution {
    static int singleElement(int[] arr , int N) {
        // code here
         int output = 0;
        for(int i = 0; i < 32 ; i ++)
        {
            int count = 0;
            for(int ele : arr)
            {
                if((ele & (1<<i)) != 0)
                    count ++;
            }
            count %= 3;
            output |= count<<i;
        }
        return output;
    }
}
