// Last updated: 8/5/2026, 11:29:53 AM
1class Solution {
2    public int countSegments(String s) {
3        int i=0;
4        int n=s.length();
5        int num=0;
6        while(i<n){
7            while(i<n&&s.charAt(i)==' '){
8                i++;
9            }
10            if(i==n){
11                break;
12            }
13            while(i<n&&s.charAt(i)!=' '){
14                i++;
15            }
16            num++;          
17        }
18        return num;
19    }
20}