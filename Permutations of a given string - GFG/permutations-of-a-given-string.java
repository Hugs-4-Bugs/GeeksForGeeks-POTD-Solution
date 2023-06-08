//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                out.print(ans.get(i)+" ");
            }
            out.println();
                        
        }
        out.close();
	}
}


// } Driver Code Ends


class Solution {
    HashSet<String> H;
    public List<String> find_permutation(String S) {
        // Code here
        int n=S.length();
        char c[]=S.toCharArray();
        H=new HashSet<>();
        H.add(S);
        fun(0,c);
        List<String> A=new ArrayList<>();
        for(String i:H){
            A.add(i);
        }
        Collections.sort(A);
        return A;
    }
    public void fun(int i,char c[])
    {
        if(i==c.length)return;
        for(int j=i;j<c.length;j++){
            if(c[i]!=c[j]){
                char temp=c[i];
                c[i]=c[j];
                c[j]=temp;
                String st="";
                for(char ch:c){
                    st+=ch;
                }
                H.add(st);
                fun(i+1,c);
                temp=c[i];
                c[i]=c[j];
                c[j]=temp;
            }else{
                fun(i+1,c);
            }
        }
    }
}