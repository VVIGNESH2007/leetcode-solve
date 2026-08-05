// Last updated: 8/5/2026, 10:37:59 AM
1class Solution {
2    public String rotate(String s){
3        int n=s.length();
4        char ch=s.charAt(n-1);
5        StringBuilder sb=new StringBuilder();
6        sb.append(ch);
7        for(int i=0;i<n-1;i++){
8            sb.append(s.charAt(i));
9        }
10        return sb.toString();
11    }
12    public boolean rotateString(String s, String goal) {
13        int n=s.length();
14        if(s.equals(goal)){
15            return true;
16        }
17        for(int i=0;i<n-1;i++){
18            s=rotate(s);
19            if(s.equals(goal)){
20                return true;
21            }
22        }
23        return false;
24    }
25}