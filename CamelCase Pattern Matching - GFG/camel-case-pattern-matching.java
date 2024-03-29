//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            String[] Dictionary=read.readLine().split(" ");
            String Pattern=read.readLine();
            Solution ob = new Solution();
            ArrayList <String> ans=ob.CamelCase(N,Dictionary,Pattern);
            for(String u:ans)
             System.out.print(u+" ");
            System.out.println(); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    ArrayList<String> ans;
    ArrayList<String> CamelCase(int N,String[] Dictionary,String Pattern){
        //code here
        ans=new ArrayList<>();
        trie root=new trie();
        build(Dictionary,root);
        find(Pattern,root);
        Collections.sort(ans);
        if(ans.isEmpty()) ans.add("-1");
        return ans;
    }
    public void build(String a[], trie root){
        trie temp=null;
        for(int i = 0;i < a.length;i++){
            temp = root;
            for(int j = 0;j < a[i].length();j++){
                if(Character.isLowerCase(a[i].charAt(j)))continue;
                if(temp.ch[a[i].charAt(j)-'A'] == null)
                    temp.ch[a[i].charAt(j)-'A'] = new trie();
                temp = temp.ch[a[i].charAt(j)-'A'];
            }
            temp.arr.add(a[i]);
        }
    }
    public int find(String s, trie root){
        for(int i = 0;i < s.length();i++){
            if(root.ch[s.charAt(i)-'A'] == null)
            return 0;
            root = root.ch[s.charAt(i)-'A'];
        }
        printAllWords(root);
        return 1;
    }
    void printAllWords(trie root) {
        for (String str : root.arr) ans.add(str);
        for (int i = 0; i < 26; i++) {
            trie child = root.ch[i];
            if (child!=null) printAllWords(child);
        }
    }
    public class trie
    {
        trie ch[];
        ArrayList<String> arr;
        public trie()
        {
            ch=new trie[26];
            for(int i=0;i<26;i++){
                ch[i]=null;
            }
            arr=new ArrayList<>();
        }
    }
}