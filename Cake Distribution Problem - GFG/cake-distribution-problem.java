//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			String [] str = br.readLine().trim().split(" ");
			int n = Integer.parseInt(str[0]);
			int k = Integer.parseInt(str[1]);
			int [] sweetness = new int[n];
			str = br.readLine().trim().split(" ");
			int i = 0;
			for(String s: str) {
				sweetness[i++] = Integer.parseInt(s);
			}
			Solution obj = new Solution();
			System.out.println(obj.maxSweetness(sweetness, n, k));
		}
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
	boolean canSplit(int [] sweetness, int mn_value, int k) {
	    int curr = 0;
	    int cnt = 0;
	    
	    for (int i = 0; i < sweetness.length; i++) {
	        curr += sweetness[i];
	        if (curr >= mn_value) {
	            cnt++;
	            curr = 0;
	        }
	    }
	    return cnt >= k + 1;
	}
	int maxSweetness(int [] sweetness, int n, int k) {
	    int sum = 0;
	    int mn_value = Integer.MAX_VALUE;
	    for (int i = 0; i < n; i++) {
	        sum += sweetness[i];
	        mn_value = Math.min(mn_value, sweetness[i]);
	    }
	    
	    int low = 1;
	    int high = sum;
	    int ans = 0;
	    
	    while (low <= high) {
	        int mid = (low + high) / 2;
	        if (canSplit(sweetness, mid, k)) {
	            ans = mid;
	            low = mid + 1;
	        } else {
	            high = mid - 1;
	        }
	    }
	    
	    return ans;
	}


}