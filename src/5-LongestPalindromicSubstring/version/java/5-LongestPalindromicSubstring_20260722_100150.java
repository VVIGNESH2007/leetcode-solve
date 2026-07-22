// Last updated: 7/22/2026, 10:01:50 AM
1class Solution {
2    public String longestPalindrome(String s) {
3        int n=s.length();
4        boolean[][] arr=new boolean[n][n];
5        int[]ans=new int[2];
6        for(int i=0;i<n;i++){
7            arr[i][i]=true;
8            ans[0]=i;
9            ans[1]=i;
10        }
11        for(int i=0;i<n;i++){
12            if(i+1<n&&s.charAt(i)==s.charAt(i+1)){
13                arr[i][i+1]=true;
14                ans[0]=i;
15                ans[1]=i+1;
16            }
17        }
18        for(int diff=2;diff<n;diff++){
19            for(int i=0;i<n-diff;i++){
20                int j=diff+i;
21                if(s.charAt(i)==s.charAt(j)&&arr[i+1][j-1]){
22                    arr[i][j]=true;
23                    ans[0]=i;
24                    ans[1]=j;
25                }
26            }
27        }
28        return s.substring(ans[0],ans[1]+1);
29    }
30}