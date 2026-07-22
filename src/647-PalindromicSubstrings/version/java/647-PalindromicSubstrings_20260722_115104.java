// Last updated: 7/22/2026, 11:51:04 AM
1class Solution {
2    public int countSubstrings(String s) {
3        int n=s.length();
4        int res=0;
5        boolean[][] arr=new boolean[n][n];
6        for(int i=0;i<n;i++){
7            arr[i][i]=true;
8            res++;
9        }
10        for(int i=0;i<n;i++){
11            if(i+1<n&&s.charAt(i)==s.charAt(i+1)){
12                arr[i][i+1]=true;
13                res++;
14            }
15        }
16        for(int diff=2;diff<n;diff++){
17            for(int i=0;i<n-diff;i++){
18                int j=diff+i;
19                if(s.charAt(i)==s.charAt(j)&&arr[i+1][j-1]){
20                    arr[i][j]=true;
21                    res++;
22                }
23            }
24        }
25        return res;
26    }
27}