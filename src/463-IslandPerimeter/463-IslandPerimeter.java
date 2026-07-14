// Last updated: 7/14/2026, 12:15:10 PM
class Solution {
    public int dfs(int[][] grid,int[] start,boolean[][] visit){
        int i=start[0];
        int j=start[1];
        visit[i][j]=true;
        int perimeter=4;//current cell area
        int[][] child={{i+1,j},{i-1,j},{i,j+1},{i,j-1}};
        for(int k=0;k<4;k++){
            i=child[k][0];
            j=child[k][1];
            if(i<grid.length&&j<grid[0].length&&i>=0&&j>=0&&grid[i][j]==1){
                perimeter--;
            }
        }
        int m=0;//perimeter of surrounded lands
        for(int k=0;k<4;k++){
            i=child[k][0];
            j=child[k][1];
            if(i<grid.length&&j<grid[0].length&&i>=0&&j>=0&&!visit[i][j]&&grid[i][j]==1){
                m+=dfs(grid,new int[]{i,j},visit);
            }
        }
        return m+perimeter;
    }
    public int islandPerimeter(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean [][] visit=new boolean[n][m];
        int answer=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){//only one island is present
                    int newanswer=dfs(grid,new int[]{i,j},visit);
                    return newanswer;
                }
            }
        }
        return answer; 
    }
}
