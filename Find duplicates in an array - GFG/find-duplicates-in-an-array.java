//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution 
{
    int max(int arr[],int n)
    {
        if(n<1)
        return 0;
        int max=arr[0];
        for(int i=0 ; i<n ; i++)
        {
            if(max<arr[i])
            max=arr[i];
        }
        return max;
    }
    public static ArrayList<Integer> duplicates(int arr[], int n) 
    {
        Solution s=new Solution();
        ArrayList<Integer> ar=new ArrayList<Integer>();
        int g=s.max(arr,n),c=0;;
        long a[]=new long[g+1];
        for(int i=0 ; i<n ; i++)
        {
            a[arr[i]]++;
        }
        for(int i=0 ; i<n ; i++)
        {
            if(a[arr[i]]>1)
            {
                ar.add(arr[i]);
                a[arr[i]]=0;
                c=1;
            }
        }
        if(c==0)
        ar.add(-1);
        Collections.sort(ar);
        return ar;
    }
}