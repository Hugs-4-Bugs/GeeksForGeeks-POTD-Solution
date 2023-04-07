//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Solution
{
	public static int addMinChar(String str){
		//code here
	int n = str.length();
        StringBuilder sb = new StringBuilder(str);
        String rev = sb.reverse().toString();
        sb.reverse();
        String s = str + "#" + rev;
        int m = s.length();
        int[] lps = new int[m];
        int len = 0;
        int i = 1;
        while (i < m) {
            if (s.charAt(i) == s.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        int palindromeLen = lps[m - 1];
        return n - palindromeLen;
    }
}

//{ Driver Code Starts.

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
        	String str = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.addMinChar(str));
        }
        
    }
}

// } Driver Code Ends