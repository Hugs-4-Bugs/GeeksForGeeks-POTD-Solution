//{ Driver Code Starts
//Initial Template for Java




import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().print2largest(arr, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int print2largest(int arr[], int n) {
        // code here
int first = Integer.MIN_VALUE; // Initialize first and second
    int second = Integer.MIN_VALUE;

    for (int i = 0; i < n; i++) {
        if (arr[i] > first) {
            // If the current element is greater than first, update both first and second
            second = first;
            first = arr[i];
        } else if (arr[i] > second && arr[i] != first) {
            // If the current element is between first and second, update only second
            second = arr[i];
        }
    }

    // If the second largest distinct element exists, return it. Otherwise, return -1.
    return (second == Integer.MIN_VALUE) ? -1 : second;
        
    }
}