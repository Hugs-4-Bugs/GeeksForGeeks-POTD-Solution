//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}

class GfG {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //testcases
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            
            //size of array
            int n = Integer.parseInt(inputLine[0]);
            Job[] arr = new Job[n];
            inputLine = br.readLine().trim().split(" ");
            
            //adding id, deadline, profit
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Job(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            
            Solution ob = new Solution();
            
            //function call
            int[] res = ob.JobScheduling(arr, n);
            System.out.println (res[0] + " " + res[1]);
        }
    }
}
// } Driver Code Ends


// 
//         // Your code here

class JobComparator implements Comparator<Job> {
    public int compare(Job j1, Job j2) {
        return j2.profit - j1.profit;
    }
}

public class Solution {
    int[] JobScheduling(Job[] arr, int n) {
        // Your code here
        Arrays.sort(arr, new JobComparator());
        
        int[] slots = new int[n];
        Arrays.fill(slots, -1);
        
        int count = 0, profit = 0;
        for (int i = 0; i < n; i++) {
            for (int j = Math.min(n, arr[i].deadline) - 1; j >= 0; j--) {
                if (slots[j] == -1) {
                    slots[j] = i;
                    count++;
                    profit += arr[i].profit;
                    break;
                }
            }
        }
        
        int[] ans = new int[2];
        ans[0] = count;
        ans[1] = profit;
        return ans;
    }
}