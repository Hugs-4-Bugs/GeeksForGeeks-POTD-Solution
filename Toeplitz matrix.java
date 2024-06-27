class Solution {
    boolean isToeplitz(int mat[][]) {
        int rows = mat.length;
        int cols = mat[0].length;

        for (int col = 0; col < cols; col++) {
            if (!checkDiagonal(mat, 0, col)) {
                return false;
            }
        }

       
        for (int row = 1; row < rows; row++) {
            if (!checkDiagonal(mat, row, 0)) {
                return false;
            }
        }

        return true;
    }

    boolean checkDiagonal(int[][] mat, int startRow, int startCol) {
        int value = mat[startRow][startCol];
        int rows = mat.length;
        int cols = mat[0].length;

        int row = startRow;
        int col = startCol;

        while (row < rows && col < cols) {
            if (mat[row][col] != value) {
                return false;
            }
            row++;
            col++;
        }

        return true;
    }

        
}

