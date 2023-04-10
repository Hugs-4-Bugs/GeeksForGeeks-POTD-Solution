//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class FastReader{ 
    BufferedReader br; 
    StringTokenizer st; 

    public FastReader(){ 
        br = new BufferedReader(new InputStreamReader(System.in)); 
    } 

    String next(){ 
        while (st == null || !st.hasMoreElements()){ 
            try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
        } 
        return st.nextToken(); 
    } 

    String nextLine(){ 
        String str = ""; 
        try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
        return str; 
    }
    
    Integer nextInt(){
        return Integer.parseInt(next());
    }
} 
    
class GFG {
    public static void main(String args[]) throws IOException {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
    
            Solution ob = new Solution();
            int ans = ob.solve(a, b, c);
            
            out.println(ans);
        }
        out.flush();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int solve(int a, int b, int c) {
        // code here
         int countA = a, countB = b, countC = c;
        StringBuilder result = new StringBuilder();
        
        while (countA > 0 || countB > 0 || countC > 0) {
            if (result.length() >= 2 &&
                    result.charAt(result.length() - 1) == result.charAt(result.length() - 2)) {
                // Last two characters are the same, try to append the third type of character
                if (countA > 0 && result.charAt(result.length() - 1) != 'a' && result.charAt(result.length() - 2) != 'a') {
                    result.append('a');
                    countA--;
                } else if (countB > 0 && result.charAt(result.length() - 1) != 'b' && result.charAt(result.length() - 2) != 'b') {
                    result.append('b');
                    countB--;
                } else if (countC > 0 && result.charAt(result.length() - 1) != 'c' && result.charAt(result.length() - 2) != 'c') {
                    result.append('c');
                    countC--;
                } else {
                    // Can't append any character without creating three consecutive characters of the same type
                    return -1;
                }
            } else {
                // Last two characters are different, try to append the character with the highest count
                if (countA >= countB && countA >= countC && countA > 0) {
                    result.append('a');
                    countA--;
                } else if (countB >= countA && countB >= countC && countB > 0) {
                    result.append('b');
                    countB--;
                } else if (countC >= countA && countC >= countB && countC > 0) {
                    result.append('c');
                    countC--;
                } else {
                    // Can't append any character without creating three consecutive characters of the same type
                    return -1;
                }
            }
        }
        
        return result.length();
    }
};