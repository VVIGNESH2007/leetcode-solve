// Last updated: 7/14/2026, 12:14:42 PM
class Solution {
    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
        int r=grid.length;
        int c=grid[0].length;
        boolean[][] vis=new boolean[r][c];
        dfs(grid,row,col,vis,color,grid[row][col]);
        return grid;
    }
    public void dfs(int[][] grid, int r, int c,boolean[][]vis, int color,int old){
        vis[r][c]=true;
        int cnt=0;
        int[][]dir={{0,1},{1,0},{0,-1},{-1,0}};
        for(int i=0;i<4;i++){
            int nr=r+dir[i][0];
            int nc=c+dir[i][1];
            if(nr>=0&&nc>=0&&nr<grid.length&&nc<grid[0].length&&(grid[nr][nc]==old||vis[nr][nc])){
                cnt++;
                if(!vis[nr][nc]){
                    dfs(grid,nr,nc,vis,color,old);
                }
            }
        }
        if(cnt<4){
            grid[r][c]=color;
        }
    }


}