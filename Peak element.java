class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
       //add code here.
          if(n==0 || n==1){
           return 0;
       }
       int i=0;
       int k=1;
       int j=2;
       while(j<n){
           if(arr[i]<=arr[k] && arr[j]<=arr[k]){
               return k;
           }
           else if(j==n-1){
               return j;
           }
            i++;
           j++;
           k++;
       }
       return n-1;
    }
}
