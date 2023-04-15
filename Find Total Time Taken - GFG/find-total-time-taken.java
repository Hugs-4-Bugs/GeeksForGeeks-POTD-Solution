//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class GFG {
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t=Integer.parseInt(in.readLine());
        while(t-->0){
            
            int n=Integer.parseInt(in.readLine().trim());
            int a[]=new int[n];
            String s[]=in.readLine().trim().split(" ");
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(s[i]);
            }
            s=in.readLine().trim().split(" ");
            int time[]=new int[n];
            for(int i=0;i<n;i++){
                time[i]=Integer.parseInt(s[i]);
            }
            Solution ob=new Solution();
            long ans=ob.totalTime(n,a,time);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static long totalTime(int n,int arr[],int time[])
    {
        HashMap<Integer,Integer> hm=new HashMap<>();
        long cache[]=new long[n];
        hm.put(arr[0],0);
        cache[0]=0;
        for(int i=1;i<n;i++){
            if(hm.containsKey(arr[i])){
                long currentTime=cache[i-1]+1;
                long previousTime=cache[hm.get(arr[i])];
                long waited=currentTime-previousTime;
                if(waited<time[arr[i]-1]){
                    currentTime+=time[arr[i]-1]-waited;
                }
                cache[i]=currentTime;
                hm.put(arr[i],i);
            }else{
                hm.put(arr[i],i);
                cache[i]=cache[i-1]+1;
            }
        }
        return cache[n-1];
    }
}