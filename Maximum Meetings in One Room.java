
class Solution {
    public static ArrayList<Integer> maxMeetings(int N, int[] S, int[] F) {
        // code here
        int[][] arr = new int[N][3];
        
        for(int i=0; i<N; i++) {
            arr[i][0] = S[i];
            arr[i][1] = F[i];
            arr[i][2] = i+1;
        }
        
        Arrays.sort(arr, (a, b) -> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]);
        
        int finish = -1;
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> canAttend = new ArrayList<>();
        
        for(int i=0; i<N; i++) {
            if(finish < arr[i][0]) {
                canAttend.add(arr[i][2]);
                finish = arr[i][1];
            } 
            if(ans.size() <= canAttend.size()) {
                ans = new ArrayList<>(canAttend);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
        
