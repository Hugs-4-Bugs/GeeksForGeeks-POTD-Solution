class Solution 
{
    static int solve(int x, int y, int[][] mat, int n, int m, int[][] vis) 
    {
        if(y == m - 1)
        {
            if(mat[x][y] == 1)
                return 0;
                
            return (int)1e9;
        }
        
        int dx[] = {-1, 1, 0, 0}, dy[] = {0, 0, -1, 1};
        int mini = (int)1e9;
        
        for(int i = 0; i < 4; i++) 
        {
            int nx = x + dx[i], ny = y + dy[i];
            if(nx >= 0 && ny >= 0 && nx < n && ny < m && vis[nx][ny] == 0 && mat[nx][ny] == 1)
            {
                vis[nx][ny] = 1;
                mini = Math.min(mini, 1 + solve(nx, ny, mat, n, m, vis));
                vis[nx][ny] = 0;
            }
        }
        
        return mini;
    }

    public static int findShortestPath(int[][] mat)
    {
        int n = mat.length, m = mat[0].length, mini = (int)1e9;
        int[][] vis = new int[n][m];
        
        for(int i = 0; i < n; i++) 
        {
            for(int j = 0; j < m; j++) 
            {
                if(mat[i][j] == 0) 
                {
                    if(i - 1 >= 0)
                        mat[i - 1][j] = -1;
                    
                    if(i + 1 < n)
                        mat[i + 1][j] = -1;
                        
                    if(j - 1 >= 0)
                        mat[i][j - 1] = -1;
                        
                    if(j + 1 < m)
                        mat[i][j + 1] = -1;
                }
            }
        }
        
        for(int i = 0; i < n; i++) 
            if(mat[i][0] == 1)
                mini = Math.min(mini, solve(i, 0, mat, n, m, vis));
            
        return mini == 1e9 ? -1 : mini + 1;
    }
}
