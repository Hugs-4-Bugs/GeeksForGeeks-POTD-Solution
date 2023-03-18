//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String input_line[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input_line[0]);
            int M = Integer.parseInt(input_line[1]);
            input_line = read.readLine().trim().split("\\s+");
            int A[]= new int[N];
            for(int i = 0; i < N; i++)
                A[i] = Integer.parseInt(input_line[i]);

            Solution ob = new Solution();
            long ans = ob.countSubarray(N, A, M); 
            System.out.println(ans);
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    public long solve(int n, int A[], int m) 
    { 
        // code here
       int[] arr= new int [2*n+1];
       Arrays.fill (arr, 0);
       long curr = n, tot = 0, ans = 0;
       arr[ (int) curr]++;
       for (int i = 0; i<n; i++) {
           int x = -1;
           if (A[i]>= m) {
               x = 1;
               
           }
           if (x == -1) {
               tot -= arr [ (int) (curr+x)];
               
           } else {
               tot += arr [ (int) curr];
               
           }
           curr += x;
           ans += tot;
           arr[ (int) curr]++;
           
       }
       return ans;
    }
       long countSubarray(int N, int[] A, int M){
           return solve (N, A, M) - solve (N, A, M+1);
    }
} 