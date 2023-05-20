//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            boolean ans = obj.isStraightHand(n, k, a);
            System.out.println(ans ? "True" : "False");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static boolean isStraightHand(int N, int W, int hand[]) {
        // code here
        int len = hand.length;
        if (len % W != 0) return false;
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (int num : hand) {
            treeMap.put(num, treeMap.getOrDefault(num, 0) + 1);
        }

        while (!treeMap.isEmpty()) {
            int first = treeMap.firstKey();
            for (int j = 1; j < W; j++) {
                int next = first + j;
                if (treeMap.containsKey(next)) {
                    treeMap.put(next, treeMap.get(next) - 1);
                    if (treeMap.get(next) == 0) treeMap.remove(next);
                } else {
                    return false;
                }
            }
            treeMap.put(first, treeMap.get(first) - 1);
            if (treeMap.get(first) == 0) treeMap.remove(first);
        }
        return true;
    }
}