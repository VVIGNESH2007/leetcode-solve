// Last updated: 7/14/2026, 12:14:35 PM
class Solution {
    public int bfs(int[][] grid,int[] st,boolean[][] vist){
        int m=grid.length;
        int i=st[0];
        int j=st[1];
        vist[i][j]=true;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i,j});
        int lev=1;
        while(!q.isEmpty()){
            int n=q.size();
            for(int k=0;k<n;k++){
            i=q.peek()[0];
            j=q.peek()[1];
            q.poll();
            if(i==m-1 && j==m-1){
                return lev;
            }
            int ch[][]={{i+1,j},{i-1,j},{i,j-1},{i,j+1},{i+1,j+1},{i-1,j-1},{i-1,j+1},{i+1,j-1}};
            for(int l=0;l<8;l++){
                int ci=ch[l][0];
                int cj=ch[l][1];
                if(ci<grid.length && cj<grid[0].length && ci>=0 && cj>=0 && !vist[ci][cj]  && grid[ci][cj]==0){
                    vist[ci][cj]=true;
                    q.add(new int[]{ci,cj});
                }
            }

            }
            lev++;

        }
        return -1;
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
      if(grid[0][0] == 1 || grid[grid.length-1][grid[0].length-1] == 1){ 
            return -1; 
        } 
        int n=grid.length;
        boolean vist[][]=new boolean[n][n];
        return bfs(grid, new int[]{0,0},vist);
        
    }
}
