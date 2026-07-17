// Last updated: 7/17/2026, 3:10:40 PM
1class Solution {
2    public int climbStairs(int n) {
3        if(n==0){
4            return 1;
5        }
6        if(n<3){
7            return n;
8        }
9        int []arr=new int[n+1];
10        arr[0]=0;
11        arr[1]=1;
12        arr[2]=2;
13        for(int i=3;i<=n;i++){
14            arr[i]=arr[i-1]+arr[i-2];
15        }
16        return arr[n];
17    }
18}