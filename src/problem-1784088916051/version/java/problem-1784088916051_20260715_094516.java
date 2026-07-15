// Last updated: 7/15/2026, 9:45:16 AM
1class Solution {
2    public int maxelement(int[][]matrix,int n,int c){
3        int max=0;
4        for(int i=0;i<n;i++){
5            max=Math.max(max,matrix[i][c]);
6        }
7        return max;
8    }
9    public int[][] modifiedMatrix(int[][] matrix) {
10        int n=matrix.length;
11        int m=matrix[0].length;
12        for(int i=0;i<n;i++){
13            for(int j=0;j<m;j++){
14                if(matrix[i][j]==-1){
15                    matrix[i][j]=maxelement(matrix,n,j);
16                }
17            }
18        }
19        return matrix;
20    }
21}