//{ Driver Code Starts
import java.util.*;
class Sorting
{
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
    // Driver program
    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

			
			new Solution().quickSort(arr,0,n-1);
			printArray(arr);
		    T--;
		}
} }
// } Driver Code Ends


class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        // code here
        if(low<high)
        {
            int mid=partition(arr,low,high);
            quickSort(arr,low,mid-1);
            quickSort(arr,mid+1,high);
        }
        
    }
    static int partition(int arr[], int low, int high)
    {
        // your code here
        int pos=low;
        int pivot=arr[low];
        while(low<=high)
        {
            while(low<=high && arr[low]<=pivot)
            {
                low++;
            }
            while(low<=high && arr[high]>pivot)
            {
                high--;
            }
            if(low<=high)
            {
               int temp=arr[low];
               arr[low]=arr[high];
               arr[high]=temp;
            }
            if(low>high) break;
        }
        int temp=arr[pos];
        arr[pos]=arr[high];
        arr[high]=temp;
        return high;
        
    } 
}

