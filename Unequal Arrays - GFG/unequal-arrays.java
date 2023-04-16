//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int N;
            N = Integer.parseInt(br.readLine());
            
            
            int[] A = IntArray.input(br, N);
            
            
            int[] B = IntArray.input(br, N);
            
            Solution obj = new Solution();
            long res = obj.solve(N, A, B);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static long solve(int N, int[] A, int[] B) {
        // code here
         long sum = 0;
        ArrayList<Integer> AP[]=new ArrayList[2], BP[]=new ArrayList[2];
        for(int i=0;i<2;i++){
            AP[i]=new ArrayList<>();
            BP[i]=new ArrayList<>();
        }
        for(int i = 0; i < N; i++) {
           sum += A[i] - B[i];
           AP[Math.abs(A[i]) % 2].add(A[i]);
           BP[Math.abs(B[i]) % 2].add(B[i]);
        }
        if(sum != 0 || (int)AP[0].size() != (int)BP[0].size())
        return -1;
        
        long ans = 0;
        for(int i = 0; i < 2; i++) {
           Collections.sort(AP[i]);
           Collections.sort(BP[i]);
        
           for(int j = 0; j < (int)AP[i].size(); j++) {
               ans += Math.abs(AP[i].get(j) - BP[i].get(j)) / 2;
           }
        }
        return ans / 2;
    }
}
        
