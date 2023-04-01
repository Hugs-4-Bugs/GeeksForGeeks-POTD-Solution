//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            int N = Integer.parseInt(br.readLine().trim());

            Solution ob = new Solution();
            System.out.println(ob.minOperations(N));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public long minOperations(int N) {
        // Code here
        // long avg = (N - 1);
        // long operations = 0;
        // for (int i = 0; i < N; i++) {
        //     operations += Math.abs(2*i + 1 - avg);
            
        // }
        // return operations / 2;
        
         long mid=N/2;
         return N%2==0?(long)mid*(long)mid:(long)mid*(long)(mid+1);
    }
}