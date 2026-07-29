// Last updated: 7/29/2026, 9:37:49 AM
1class Solution {
2    public char findTheDifference(String s, String t) {
3        if(s.length()==0){
4            return t.charAt(0);
5        }
6        if(t.length()==0){
7            return s.charAt(0);
8        }
9        int[]arr=new int[26];
10        int[]brr=new int[26];
11        for(int i=0;i<s.length();i++){
12            arr[s.charAt(i)-'a']++;
13        }
14        for(int i=0;i<t.length();i++){
15            brr[t.charAt(i)-'a']++;
16        }
17        for(int i=0;i<=25;i++){
18            if(arr[i]!=brr[i]){
19                return (char)('a'+i);
20            }
21        }
22        return 'a';
23    }
24}