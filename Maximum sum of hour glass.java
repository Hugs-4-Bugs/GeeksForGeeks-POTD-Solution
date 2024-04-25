class Solution {
    int findMaxSum(int n, int m, int mat[][]) {
        // Initialize the default value if no hourglass is found
        int sum = -1;
        
        // Check every pos in the matrix and see if we can an hourglass
        // If hourglass is possible at that position, find the sum 
        // and store it in the sum variable if exceeds the existing sum.
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(canGetHourglass(i, j, n, m)){
                    sum = Math.max(sum, getHourglassSum(i, j, mat));
                }
            }
        }
        return sum;
    }
    
    
    // Get the sum of the hourglass from the given pos
    int getHourglassSum(int i, int j, int[][] mat){
        int sum = 0;
        
        for(int k=0; k<3; k++){
            sum+= mat[i][j+k];      // Top row
            sum+= mat[i+2][j+k];    // Bottom Row
        }
            
        // Middle Element
        sum+= mat[i+1][j+1];
            
        return sum;
    }
    
    
    // Determines if we can get an hourglass from the given position
    boolean canGetHourglass(int i, int j, int n, int m){
        if(i+2 >= n)
            return false;
            
        if(j+2 >=m)
            return false;
            
        return true;
    }
};
