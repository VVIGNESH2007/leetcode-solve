// Last updated: 7/16/2026, 10:25:03 AM
1class Solution {
2    public void rotate(int[][] matrix) {
3        int n=matrix.length;
4        for(int i=0;i<n;i++){
5            for(int j=i;j<n;j++){
6                int t=matrix[i][j];
7                matrix[i][j]=matrix[j][i];
8                matrix[j][i]=t;
9            }
10        }
11        for(int i=0;i<n;i++){
12            int l=0;
13            int r=n-1;
14            while(l<r){
15                int t=matrix[i][l];
16                matrix[i][l]=matrix[i][r];
17                matrix[i][r]=t;
18                l++;
19                r--;
20            }
21        }
22    }
23}