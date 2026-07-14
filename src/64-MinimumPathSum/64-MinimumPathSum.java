// Last updated: 7/14/2026, 12:16:59 PM
class Solution {
    public int path(int i,int j,int m,int n,int[][] grid,int dp[][]){
        if(i==m || j==n){
            return 0;
        }
        if(i==m-1 && j==n-1 ){
            return grid[i][j];
        }
        int left=Integer.MAX_VALUE;
        int down=Integer.MAX_VALUE;
        if(dp[i][j]==-1){
        if(j+1<n ){
            left= grid[i][j]+path(i,j+1,m,n,grid,dp);
            
        }
        if(i+1<m ){
            down= grid[i][j]+path(i+1,j,m,n,grid,dp);
        }
        dp[i][j]= Math.min(left , down);

        }
        else{
            return  dp[i][j];
        }
        return  dp[i][j];
     }
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return path(0,0,m,n,grid,dp);
        
    }
}