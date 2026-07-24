// Last updated: 7/24/2026, 2:08:57 PM
1class Solution {
2    public int minimumMoves(String s) {
3        int i=0;
4        int n=s.length();
5        int ans=0;
6        while(i<n){
7            while(i<n&&s.charAt(i)!='X'){
8                i++;
9            }
10            if(i==n){
11                break;
12            }
13            i=i+3;
14            ans++;
15        }
16        return ans;
17    }
18}