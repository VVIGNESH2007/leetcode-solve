// Last updated: 7/15/2026, 9:34:10 AM
1class Solution {
2    public int areaOfMaxDiagonal(int[][] dimensions) {
3        double max=0;
4        int area=0;
5        for(int i=0;i<dimensions.length;i++){
6            int n=dimensions[i][0];
7            int m=dimensions[i][1];
8            int dl=(n*n)+(m*m);
9            if(dl>max){
10                max=dl;
11                area=dimensions[i][0]*dimensions[i][1];
12            }
13            else if(dl==max){
14                area=(int)Math.max(area,dimensions[i][0]*dimensions[i][1]);
15            }
16        }
17        return area;
18
19    }
20}