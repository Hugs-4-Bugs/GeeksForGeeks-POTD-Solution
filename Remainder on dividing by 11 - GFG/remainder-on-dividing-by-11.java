//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        
        int t = Integer.parseInt(br.readLine()); 

        while(t > 0){
  
            String x = br.readLine(); 
            
            Solution ob = new Solution();
		
            System.out.println(ob.xmod11(x)); 

            t--;
        }
    } 
} 



// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    static int xmod11(String x)
	{    
	    // code here
	    
	   // Approach 1
	    
	    
	   // int cur=0; int rem=0;
	   // for(int i=0 ;i<x.length(); i++)
	   // {
	   //     cur = rem*10 + x.charAt(i)-'0';
	   //     rem =cur%11;
	   // }
	   // return rem;
	   
	   
	   
	   
	   
	   // Approach 2
	   
	   int n = x.length();
        int rem = 0;
        for (int i = 0; i < n; i++) {
            int digit = x.charAt(i) - '0';
            rem = ((rem * 10) % 11 + digit % 11) % 11;
        }
        return rem;
    }

    public static void main(String[] args) {
        String x = "231456786543567898765";
        System.out.println(xmod11(x)); // Output: 1
        
	}
} 

