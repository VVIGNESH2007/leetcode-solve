// Last updated: 7/21/2026, 9:13:31 AM
1class Solution {
2    public boolean isValid(String s) {
3        int n=s.length();
4        Stack<Character> st=new Stack<>();
5        for(int i=0;i<n;i++){
6            char c=s.charAt(i);
7            if(c=='('||c=='['||c=='{'){
8                st.push(c);
9            }
10            else if(!st.isEmpty()&&c==')'&&st.peek()=='('){
11               st.pop();
12             }
13            else if(!st.isEmpty()&&c=='}'&&st.peek()=='{'){
14                st.pop();
15            }
16            else if(!st.isEmpty()&&c==']'&&st.peek()=='['){
17                st.pop();
18            }else{
19               return false;
20            }
21        }
22        return st.isEmpty();
23    }
24}