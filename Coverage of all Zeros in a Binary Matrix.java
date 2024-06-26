class Solution {
    public int findCoverage(int[][] matrix) {
        // code here
        int res = 0;
        int n = matrix.length;
        int m = matrix[0].length;
        int[] row = {-1, 1, 0, 0};
        int[] col = {0, 0, -1, 1};
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == 0){
                    for(int x = 0; x<4; x++){
                        int nrow = i+row[x];
                        int ncol = j+col[x];
                        if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && matrix[nrow][ncol] == 1){
                            res++;
                        }
                    }
                }
            }
        }
        return res;
    }
}
