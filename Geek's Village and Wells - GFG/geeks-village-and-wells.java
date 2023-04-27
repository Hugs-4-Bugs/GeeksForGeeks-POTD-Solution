//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Gfg {
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t=Integer.parseInt(in.readLine());
        while(t-->0){
            
            String s[]=in.readLine().trim().split(" ");
            int n=Integer.parseInt(s[0]);
            int m=Integer.parseInt(s[1]);
            char c[][]=new char[n][m];
            for(int i=0;i<n;i++){
                s=in.readLine().trim().split(" ");
                for(int j=0;j<m;j++){
                    c[i][j]=s[j].charAt(0);
                }
            }
            Solution ob=new Solution();
            int ans[][]=ob.chefAndWells(n, m, c);

            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    out.print(ans[i][j]+" ");
                }
                out.println();
            }
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    public int[][] chefAndWells(int n,int m,char c[][])
    {
        int ans[][]=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(ans[i],Integer.MAX_VALUE);
        }

        boolean v[][]=new boolean[n][m];
        Queue<pair> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(c[i][j]=='W'){
                    v[i][j]=true;
                    ans[i][j]=0;
                    q.add(new pair(i,j,0));
                }
            }
        }

        int dx[]={0,0,-1,1};
        int dy[]={-1,1,0,0};

        while(!q.isEmpty()){
            pair p=q.poll();
            for(int i=0;i<4;i++){
                int nx=p.a+dx[i],ny=p.b+dy[i];
                if(nx>=0 && nx<n && ny>=0 && ny<m && !v[nx][ny] && c[nx][ny]!='N'){
                    q.add(new pair(nx,ny,p.c+1));
                    v[nx][ny]=true;
                    ans[nx][ny]=p.c+1;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(c[i][j]=='.'){
                    ans[i][j]=0;
                }else if(c[i][j]=='N'){
                    ans[i][j]=0;
                }else if(ans[i][j]==Integer.MAX_VALUE){
                    ans[i][j]=-1;
                }else{
                    ans[i][j]*=2;
                }
            }
        }

        return ans;
    }
    public class pair
    {
        int a,b,c;
        public pair(int a,int b,int c)
        {
            this.a=a;
            this.b=b;
            this.c=c;
        }
    }
}