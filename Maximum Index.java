class Solution{
    
    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
    static int maxIndexDiff(int a[], int n) { 
        
        // Your code here
          int i=0,j=n-1,res =0;
        while(i<=j){
            if(a[i]<=a[j]){
            res=Math.max(res,j-i);
            j=n-1;
            i++;
        }
        else j--;
          }  return res;
        
    }
}


