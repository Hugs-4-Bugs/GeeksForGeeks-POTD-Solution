//User function Template for Java




class  Solution
{
    void helper(long arr[],int i, int j , int counter){
       if(counter<= 0){
           return;
       }
       long a = arr[i];
       long b = arr[j];
       
       helper(arr,i-1,j-1,counter - 2);
       
       arr[counter - 2] = a;
       arr[counter - 1] = b;
       return;
    }
    void shuffleArray(long arr[], int n)
    {
        // Your code goes here
        helper(arr, arr.length/2 - 1, arr.length - 1, arr.length);
        
    }
}
