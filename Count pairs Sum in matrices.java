class Solution {
    int countPairs(int mat1[][], int mat2[][], int n, int x) {
        
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                set.add(mat2[i][j]);
            }
        }
        int ans = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int val = x - mat1[i][j];
                if(set.contains(val)){
                    ans++;
                }
            }
        }
        return ans;
        
    }
}
