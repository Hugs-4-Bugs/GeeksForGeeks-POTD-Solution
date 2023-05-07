//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            String str;
            str = br.readLine();
            
            Solution obj = new Solution();
            String res = obj.stringMirror(str);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static String stringMirror(String str) {
        // code here
        char last=str.charAt(0);
        StringBuilder tmp=new StringBuilder(),ans1=new StringBuilder(),ans2=new StringBuilder();
        tmp.append(str.charAt(0));
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)<last){
                last=str.charAt(i);
                tmp.append(last);
            }
            else break;
        }
        ans1.append(tmp);
        tmp.reverse();
        ans1.append(tmp);
        tmp=new StringBuilder();
        tmp.append(str.charAt(0));
        last=str.charAt(0);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)<=last){
                last=str.charAt(i);
                tmp.append(last);
            }
            else break;
        }
        ans2.append(tmp);
        tmp.reverse();
        ans2.append(tmp);
        if(ans1.toString().compareTo(ans2.toString())<=0){
            return ans1.toString();
        }else{
            return ans2.toString();
        }
    }
}