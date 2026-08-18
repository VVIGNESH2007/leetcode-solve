// Last updated: 8/18/2026, 11:59:24 AM
1class Solution {
2    public int minDistance(String word1, String word2) {
3        int m = word1.length();
4        int n = word2.length();
5        
6        int[][] dp = new int[m+1][n+1];  //for empty string
7
8        //base case
9        for(int j=0;j<=n;j++){        // word1="" & word2="cat"
10            dp[0][j] = j;
11        }
12        for(int i=0;i<=m;i++){        //word1="cut" & word2=""
13            dp[i][0] = i;
14        }
15        for(int i=1;i<=m;i++){
16            for(int j=1;j<=n;j++){
17                if(word1.charAt(i-1) == word2.charAt(j-1)){  //both are same
18                    dp[i][j] = dp[i-1][j-1];        //No operation
19                }
20                else{
21                    int insert = dp[i][j-1];
22                    int delete = dp[i-1][j];
23                    int replace = dp[i-1][j-1];
24
25                    dp[i][j] = 1 + Math.min(insert,Math.min(delete,replace));
26
27                }
28            }
29        }
30        return dp[m][n];
31    }
32}