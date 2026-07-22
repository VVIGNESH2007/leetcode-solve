// Last updated: 7/22/2026, 12:25:12 PM
1class Solution {
2    public int count(String s,int i,int j){
3        int c=0;
4        while(i>=0&&j<s.length()&&s.charAt(i)==s.charAt(j)){
5            c++;
6            i--;
7            j++;
8        }
9        return c;
10    }
11    public int countSubstrings(String s) {
12        int c=0;
13        for(int i=0;i<s.length();i++){
14            c+=count(s,i,i);
15            c+=count(s,i,i+1);
16        }
17        return c;
18    }
19}