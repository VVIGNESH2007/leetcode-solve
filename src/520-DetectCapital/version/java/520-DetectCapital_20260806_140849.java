// Last updated: 8/6/2026, 2:08:49 PM
1class Solution {
2    public boolean dfullcaps(String s){
3        String d=s;
4        d=d.toUpperCase();
5        for(int i=0;i<d.length();i++){
6            if(s.charAt(i)!=d.charAt(i)){
7                return false;
8            }
9        }
10        return true;
11    }
12    public boolean dfulls(String s){
13        String d=s;
14        d=d.toLowerCase();
15        for(int i=0;i<d.length();i++){
16            if(s.charAt(i)!=d.charAt(i)){
17                return false;
18            }
19        }
20        return true;
21    }
22    public boolean dficaps(String s){
23        String d=s;
24        d=d.toUpperCase();
25        if(s.charAt(0)!=d.charAt(0)){
26            return false;
27        }
28        for(int i=1;i<d.length();i++){
29            if(s.charAt(i)==d.charAt(i)){
30                return false;
31            }
32        }
33        return true;
34    }
35    public boolean detectCapitalUse(String word) {
36        return dfullcaps(word)||dficaps(word)||dfulls(word);
37    }
38}