// Last updated: 7/14/2026, 12:14:44 PM
class Solution {
    
    public int numEnclaves(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        
        // Step 1: Remove boundary connected lands
        for (int i = 0; i < m; i++) {
            dfs(grid, i, 0);          // Left boundary
            dfs(grid, i, n - 1);      // Right boundary
        }
        
        for (int j = 0; j < n; j++) {
            dfs(grid, 0, j);          // Top boundary
            dfs(grid, m - 1, j);      // Bottom boundary
        }
        
        // Step 2: Count remaining land cells
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    count++;
                }
            }
        }
        
        return count;
    }
    
    private void dfs(int[][] grid, int i, int j) {
        
        int m = grid.length;
        int n = grid[0].length;
        
        // Boundary check
        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == 0) {
            return;
        }
        
        // Mark visited land as sea
        grid[i][j] = 0;
        
        // 4 directions
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }
}