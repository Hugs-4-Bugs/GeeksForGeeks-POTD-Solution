class Solution
{
    int columnWithMaxZeros(int arr[][], int N)
    {
        // code here 
            int max=0;
    int index=-1;
    
        for(int i=0; i<N; i++){
            int temp=0;
            for(int j=0; j<N; j++){
                temp += arr[j][i]==0?1:0;
            }
            if(max<temp) {max = temp; index=i;}
        }
        return index;
    }
}
