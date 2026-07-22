// Last updated: 7/22/2026, 12:34:29 PM
1class Solution {
2    public boolean pal(String s,int l,int r){
3        while(l<r){
4            if(s.charAt(l)!=s.charAt(r)){
5                return false;
6            }
7            l++;
8            r--;
9        }
10        return true;
11    }
12    public boolean validPalindrome(String s) {
13        int i=0;
14        int j=s.length()-1;
15        while(i<j){
16            if(s.charAt(i)==s.charAt(j)){
17                i++;
18                j--;
19            }else{
20                return pal(s,i+1,j)||pal(s,i,j-1);
21            }
22        }
23        return true;
24    }
25}