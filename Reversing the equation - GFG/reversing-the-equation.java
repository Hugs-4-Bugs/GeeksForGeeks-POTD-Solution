//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        while(t-- > 0)
        {
            String s;
            s = in.readLine().trim();
            
            Solution ob = new Solution();
            
            out.println(ob.reverseEqn(s));    
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
   
    String reverseEqn(String S)
    {
        // your code here
         Stack<String> stack = new Stack<>();
        StringBuilder reversedEqn = new StringBuilder();

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            if (Character.isDigit(ch)) {
                int j = i;
                while (j < S.length() && Character.isDigit(S.charAt(j))) {
                    j++;
                }
                String num = S.substring(i, j);
                stack.push(num);
                i = j - 1;
            } else {
                stack.push(Character.toString(ch));
            }
        }

        while (!stack.isEmpty()) {
            reversedEqn.append(stack.pop());
        }

        return reversedEqn.toString();
    }

    public void main(String[] args) {
        String equation1 = "20-3+5*2";
        String reversed1 = reverseEqn(equation1);
        System.out.println(reversed1);  // Output: 2*5+3-20

        String equation2 = "5+2*56-2/4";
        String reversed2 = reverseEqn(equation2);
        System.out.println(reversed2);  
    }
}