// Last updated: 7/24/2026, 3:10:52 PM
1class Solution {
2    public String reverseWords(String s) {
3        Stack<String> st=new Stack<>();
4        int i=0;
5        int n=s.length();
6        while(s.charAt(i)==' '){
7            i++;
8        }
9        int j=i;
10        while(j<n){
11            while(j!=n&&s.charAt(j)!=' '){
12                j++;
13            }
14            st.push(s.substring(i,j));
15            while(j<n&&s.charAt(j)==' '){
16                j++;
17            }
18            i=j;
19        }
20        // while(st.peek().length()==0){
21        //     st.pop();
22        // }
23        StringBuilder sb=new StringBuilder();
24        while(!st.isEmpty()){
25            sb.append(st.pop());
26            if(!st.isEmpty()){
27                sb.append(" ");
28            }
29        }
30        String d=new String(sb);
31        return d;
32    }
33}