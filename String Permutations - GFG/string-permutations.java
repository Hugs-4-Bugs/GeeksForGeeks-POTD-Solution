//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0)
		{
		    
		    Solution ob=new Solution();
		    
		    String S=sc.nextLine();
		    
		    ArrayList<String> arr = ob.permutation(S);
		    for(String s : arr){
		        System.out.print(s+" ");
		    }
		    System.out.println();
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    public ArrayList<String> permutation(String s)
    {
        //Your code here
        ArrayList<String> al=new ArrayList<>();
        permute(s,al,0,s.length()-1);
        Collections.sort(al);
        return al;
    }
    
    static void permute(String str,ArrayList<String> al,int l,int r){
        if(l==r){
            al.add(str);
            return;
        }
        for(int i=l;i<=r;i++){
            str=swap(str,l,i);
            permute(str,al,l+1,r);
            str=swap(str,l,i);
        }
    }
    static String swap(String str,int l,int r){
        char ch[]=str.toCharArray();
        
           char temp=ch[l];
           ch[l]=ch[r];
           ch[r]=temp;
           return new String(ch);
    }
	   
}
