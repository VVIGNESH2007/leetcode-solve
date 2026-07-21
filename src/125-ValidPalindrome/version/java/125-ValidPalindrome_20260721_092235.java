// Last updated: 7/21/2026, 9:22:35 AM
1class Solution {
2    public boolean isPalindrome(String s) {
3        int i=0;
4        int j=s.length()-1;
5        s=s.toLowerCase();
6        while(i<j){
7            while(i<j&&!Character.isLetterOrDigit(s.charAt(i))){
8                i++;
9            }
10            while(i<j&&!Character.isLetterOrDigit(s.charAt(j))){
11                j--;
12            }
13            if(s.charAt(i)!=s.charAt(j)){
14                return false;
15            }
16            i++;
17            j--;
18        }
19        return true;
20    }
21}