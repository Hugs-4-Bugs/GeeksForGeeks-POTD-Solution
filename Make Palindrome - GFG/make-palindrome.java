//{ Driver Code Starts
import java.io.*;
import java.util.*;


class StringArray
{
    public static String[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        return s;
    }

    public static void print(String[] a)
    {
        for(String e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<String> a)
    {
        for(String e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            String[] arr = StringArray.input(br, n);
            
            Solution obj = new Solution();
            boolean res = obj.makePalindrome(n, arr);
            
            String _result_val = (res) ? "YES" : "NO";
            System.out.println(_result_val);
        }
    }
}

// } Driver Code Ends


class Solution {
    public static boolean makePalindrome(int n, String[] arr) {
        // code here
        HashMap<String,Integer> hm=new HashMap<>();
        HashMap<String,Integer> temp=new HashMap<>();
        for(String i:arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int q=0;
        for(String st:hm.keySet()){
            int x=hm.get(st);
            if(palindrome(st)){
                temp.put(st,hm.get(st));
                continue;
            }
            StringBuilder sb=new StringBuilder();
            sb.append(st);
            sb.reverse();
            int y=hm.getOrDefault(sb.toString(),0);
            
            if(y!=0 && x!=y){
                q=1;
                break;
            }
            if(y==0){
                q=1;
                break;
            }
        }
        if(q==1){
            return false;
        }
        int odd=0;
        for(int i:temp.values()){
            if(i%2==1){
                odd++;
            }
        }
        if(odd>1){
            return false;
        }
        return true;
    }
    public static boolean palindrome(String s)
    {
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}     
