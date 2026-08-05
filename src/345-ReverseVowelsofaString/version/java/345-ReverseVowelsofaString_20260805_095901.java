// Last updated: 8/5/2026, 9:59:01 AM
1class Solution {
2    public String reverseVowels(String s) {
3        Stack<Character>st=new Stack<>();
4        int n=s.length();
5        for(int i=0;i<n;i++){
6            char nc=s.charAt(i);
7            if(nc=='a'||nc=='e'||nc=='i'||nc=='o'||nc=='u'||nc=='A'||nc=='E'||nc=='I'||nc=='O'||nc=='U'){
8                st.push(nc);
9            }
10        }
11        StringBuilder sb=new StringBuilder();
12        for(int i=0;i<n;i++){
13            char nc=s.charAt(i);
14            if(nc=='a'||nc=='e'||nc=='i'||nc=='o'||nc=='u'||nc=='A'||nc=='E'||nc=='I'||nc=='O'||nc=='U'){
15                sb.append(st.pop());
16            }else{
17                sb.append(s.charAt(i));
18            }
19        }
20        return sb.toString();
21    }
22}