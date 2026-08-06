// Last updated: 8/6/2026, 1:55:30 PM
1class Solution {
2    public int[] shortestToChar(String s, char c) {
3        int n=s.length();
4        int i=0;
5        int[]ans=new int[n];
6        while(i<n){
7            int ni=i;
8            int pi=i;
9            while(s.charAt(ni)!=c){
10                ni++;
11                if(ni>n-1){
12                    ni=-1;
13                    break;
14                }
15            }
16            while(s.charAt(pi)!=c){
17                pi--;
18                if(pi<0){
19                    pi=-1;
20                    break;
21                }
22            }
23
24            if(pi==-1){
25                ans[i]=ni-i;
26            }else if(ni==-1){
27                ans[i]=i-pi;
28            }    
29            else{
30                ans[i]=Math.min(ni-i,i-pi);
31            }
32            i++;
33        }
34        return ans;
35
36    }
37}