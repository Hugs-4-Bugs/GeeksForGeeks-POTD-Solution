//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            
            //taking input n
            int n = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            
            //adding elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            Solution ob = new Solution();
            
            //calling equilibriumPoint() function
            System.out.println(ob.equilibriumPoint(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
         if(n == 1){
            return 1;
        }
       long leftsum = 0;
       long rightsum = 0;
       // calculate the right sum
       for(int i = 1; i < n; i++){
           rightsum = rightsum + arr[i];
       }
       // calculate the left sum
       for(int i = 0; i < n-1; i++){
           // check if rightsum === leftsum
           if(rightsum == leftsum){
               return i+1;
           }
           else{
               // if upper conditon are not true then 
               // we are substract the arr[i+1] element in rightsum and add the arr[i]       element in leftsum
               //then again check the upper condition again and again.
               rightsum = rightsum - arr[i+1];
               leftsum = leftsum + arr[i];
           }
       }
       return -1;
    }
}
