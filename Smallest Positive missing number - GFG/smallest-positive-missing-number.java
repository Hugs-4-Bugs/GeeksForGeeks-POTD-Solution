//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends

class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
           HashSet<Integer> set=new HashSet<>();
        
        for(int i=0;i<size;i++)
        {
            if(arr[i]>0)
            set.add(arr[i]);  //saving +ve numbers only in hashset
        }
        int min=1;
        while(true){   

       if(!set.contains(min)) return min; 

             min++;
        }
        /* checking from 1 to missing number which Is least +ve number simply by incrementing value */
    }
}
    


//{ Driver Code Starts.

class Main
{   
    public static void main (String[] args) 
    {

		Scanner sc=new Scanner(System.in);
		
        //taking testcases
		int t=sc.nextInt();
		while(t-->0){
		    
		    //input number n
			int n=sc.nextInt();
			int[] arr=new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
				
			Solution obj = new Solution();
			
			//calling missingNumber()
			int missing = obj.missingNumber(arr,n);
			System.out.println(missing);
		}
    }
}


// } Driver Code Ends