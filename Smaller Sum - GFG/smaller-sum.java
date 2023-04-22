//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;

public class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t=Integer.parseInt(in.readLine());
        while(t-->0){
            int n=Integer.parseInt(in.readLine());
            String s[]=in.readLine().trim().split(" ");
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(s[i]);
            }
            Solution ob=new Solution();
            long ans[]=ob.smallerSum(n,a);
            for(long i:ans){
                out.print(i+" ");
            }out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    public long[] smallerSum(int n,int arr[])
    {
        long ans[]=new long[n];
        long temp[]=new long[n];
        for(int i=0;i<n;i++){
            temp[i]=arr[i];
        }
        Arrays.sort(temp);
        long pre[]=new long[n];
        pre[0]=temp[0];
        for(int i=1;i<n;i++){
            pre[i]=temp[i]+pre[i-1];
        }
        for(int i=0;i<n;i++){
            if(temp[0]>=arr[i]){
                ans[i]=0;
                continue;
            }
            int l=0,r=n-1;
            while(l<r){
                int mid=(l+r+1)/2;
                if(temp[mid]>=arr[i]){
                    r=mid-1;
                }else{
                    l=mid;
                }
            }
            ans[i]=pre[l];
        }
        return ans;
    }
}