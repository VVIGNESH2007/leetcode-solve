// Last updated: 7/24/2026, 10:58:36 AM
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        for(int i=0;i<strs[0].length();i++){
4            for(int j=1;j<strs.length;j++){
5                if(strs[j].length()==i||strs[0].charAt(i)!=strs[j].charAt(i)){
6                    return strs[0].substring(0,i);
7                }
8            }
9        }
10        return strs[0];
11    }
12}