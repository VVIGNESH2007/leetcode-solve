// Last updated: 7/14/2026, 12:14:45 PM
class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        boolean[][] vist=new boolean[n][m];
        boolean freshorange =false;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                    if(grid[i][j]==2){//rotten orange
                        q.add(new int[]{i,j});
                    }
                    if(grid[i][j]==1){
                        freshorange=true;
                    }
                
            }
        }
        if(!freshorange){
            return 0;
        }
        int min=0;
        while(!q.isEmpty()){
            int s=q.size();
            for(int u=0;u<s;u++){
                int i=q.peek()[0];
                int j=q.peek()[1];
                q.poll();
                int[][] child ={{i+1,j},{i-1,j},{i,j+1},{i,j-1}};
                for(int k=0;k<4;k++){
                    int ci=child[k][0];
                    int cj=child[k][1];
                    if(ci>=0 && ci<n && cj>=0 && cj<m && grid[ci][cj]==1){
                        grid[ci][cj]=2;
                        q.add(new int[]{ci,cj});
                    }
                }
        }
        min++;

    }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    return -1;
                   
                }
            }
        }

        return min-1;   
    }
}
