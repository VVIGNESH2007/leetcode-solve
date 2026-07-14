// Last updated: 7/14/2026, 12:15:02 PM
class Solution {
    public int dfs(int[][] grid,int[] start,boolean[][] visit){
        int i=start[0];
        int j=start[1];
        visit[i][j]=true;
        int area=1;//current area
        int[][] child={{i+1,j},{i-1,j},{i,j+1},{i,j-1}};
        for(int k=0;k<4;k++){
            i=child[k][0];
            j=child[k][1];
            if(i<grid.length&&j<grid[0].length&&i>=0&&j>=0&&!visit[i][j]&&grid[i][j]==1){
                area+=dfs(grid,new int[]{i,j},visit);
            }
        }
        return area;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean [][] visit=new boolean[n][m];
        int answer=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!visit[i][j]&&grid[i][j]==1){//new component==new island
                    int newanswer=dfs(grid,new int[]{i,j},visit);
                    answer=Math.max(answer,newanswer);
                }
            }
        }
        return answer;
    }
}