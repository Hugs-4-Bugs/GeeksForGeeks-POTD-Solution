class Solution
{
    public int[] antiDiagonalPattern(int[][] matrix)
    {
        // Code here
          int row=matrix.length;
        int col=matrix[0].length;
        int []arr=new int[row*col];
        int l=0;
        for(int i=0;i<row;i++){
            int j=i;
            for(int k=0;k<=i;k++){
             arr[l]=matrix[k][j];
             j--;
             l++;
            }
        }
           for(int i=1;i<row;i++){
            int j=i;
            for(int k=col-1;k>=i;k--){
             arr[l]=matrix[j][k];
             j++;
             l++;
            }
        }
        
        return arr;



    }
}
