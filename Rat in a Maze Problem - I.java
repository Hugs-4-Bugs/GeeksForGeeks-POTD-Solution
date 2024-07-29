class Solution {
    
    // For Down And Right direction 
    static int[] row = {1, 0, 0, -1};
    
    //For Left and Right direction
    static int[] col = {0, -1, 1, 0};
    
    //For Direction Corrensponding Path Mark
    static String [] path = {"D", "L", "R", "U"};
    
    
    static void getPath(int[][] mat, int i, int j, int n, int m, String str, ArrayList<String>ans, boolean[][]vis)
    {
        if(i==n-1 && j==m-1 && mat[i][j]==1)
        {
            ans.add(str);
            str="";
            return;
        }
        
        //Checking Out of bound Condition
        boolean out = (i>=n || i<0 || j>=m || j<0);
        
        // Checking with visited and grid matrix
        if(out || mat[i][j]==0 || vis[i][j]) return;
        
        // first mark true till reach end;
        vis[i][j] = true;
        
        // Taking loop for traversing in four directions
        for(int d=0; d<4; d++)
        {
            int delrow = i+row[d];
            int delcol = j+col[d];
            
            getPath(mat, delrow, delcol, n, m, str+path[d], ans, vis);
        }
        
        // After reaching end backtrack then make sure unvisit the grid bolck
        vis[i][j]=false;
        
    }
    
    public ArrayList<String> findPath(int[][] mat) {
        
        // For Returning Answer
        ArrayList<String>ans = new ArrayList<>(); 
        int n = mat.length;
        int m = mat[0].length;
        
        // Visited Matrix as boolean form -> U can take as int form 
        boolean[][]vis = new boolean[n][m];
        
        // Method to get all Paths to reach end;
        getPath(mat, 0, 0, n, m, "", ans, vis);
        
        return ans;
    }
}

