//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
    
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
	    Complete obj = new Complete();
		obj.precompute();    	
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int N = Integer.parseInt(element[0]);
		    int M = Integer.parseInt(element[1]);
		    int arr [][] = new int[M][2];
		    for(int i = 0;i<M;i++){
	            line = br.readLine();
		        String[] elements = line.trim().split("\\s+");
		        arr[i][0] = Integer.parseInt(elements[0]);
		        arr[i][1] = Integer.parseInt(elements[1]);    
	        }
            int ans = obj.helpSanta(N, M, arr);
            System.out.println(ans);
    	    
		}
	}
}




// } Driver Code Ends


//User function Template for Java


class Complete{
    static ArrayList<Integer> graph[];
    static int cnt;
    static ArrayList<Integer> primes;
    public static void precompute () {
        //Complete the function
        primes=new ArrayList<>();
        int N=3000000;
        boolean v[]=new boolean[N+1];
        Arrays.fill(v,true);
        for(int i=2;i*i<=N;i++){
            if(v[i]){
                for(int j=i*i;j<=N;j+=i){
                    v[j]=false;
                }
            }
        }
        for(int i=2;i<=N;i++){
            if(v[i]){
                primes.add(i);
            }
        }
    }
    // Function for finding maximum and value pair
    public static int helpSanta (int n, int m, int g[][]) {
        graph=new ArrayList[n+1];
        for(int i=0;i<=n;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<m;i++){
            graph[g[i][0]].add(g[i][1]);
            graph[g[i][1]].add(g[i][0]);
        }
        boolean v[]=new boolean[n+1];
        int max_connection=0;
        for(int i=1;i<=n;i++){
            if(!v[i]){
                cnt=0;
                dfs(i,v);
                max_connection=Math.max(max_connection,cnt);
            }
        }
        if(max_connection==1)return -1;
        return primes.get(max_connection-1);
    }
    public static void dfs(int s,boolean v[])
    {
        v[s]=true;
        cnt++;
        for(int i:graph[s]){
            if(!v[i]){
                dfs(i,v);  
            }
        }
    }
    
    
}