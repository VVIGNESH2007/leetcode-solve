// Last updated: 8/5/2026, 12:12:26 PM
1class Solution {
2    public String reverseWords(String s) {
3        Stack<Character> st=new Stack<>();
4        int i=0;
5        int n=s.length();
6        StringBuilder sb=new StringBuilder();
7        while(i<n){
8            while(i<n&&s.charAt(i)==' '){
9                st.push(s.charAt(i));
10                i++;
11            }
12            while(!st.isEmpty()){
13                sb.append(st.pop());
14            }
15            while(i<n&&s.charAt(i)!=' '){
16                st.push(s.charAt(i));
17                i++;
18            }
19            while(!st.isEmpty()){
20                sb.append(st.pop());
21            }
22        }
23        return sb.toString();
24    }
25}