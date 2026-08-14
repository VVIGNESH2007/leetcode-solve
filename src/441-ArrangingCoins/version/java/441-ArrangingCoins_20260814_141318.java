// Last updated: 8/14/2026, 2:13:18 PM
1class Solution {
2    public int arrangeCoins(int n) {
3        if(n<=1){
4            return n;
5        }
6        int r=0;
7        while(n>=1){
8            n=n-(r+1);
9            r++;
10        }
11        if(n==0){
12            return r;
13        }
14        return r-1;
15    }
16}