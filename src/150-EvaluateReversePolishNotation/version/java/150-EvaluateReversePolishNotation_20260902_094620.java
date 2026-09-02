// Last updated: 9/2/2026, 9:46:20 AM
1class Solution {
2    public int evalRPN(String[] tokens) {
3        Stack<Integer> st=new Stack<>();
4        for(String num:tokens){
5            if(num.equals("+")){
6                int a=st.pop();
7                int b=st.pop();
8                st.push(a+b);
9            }
10            else if(num.equals("-")){
11                int a=st.pop();
12                int b=st.pop();
13                st.push(b-a);
14            }
15            else if(num.equals("*")){
16                int a=st.pop();
17                int b=st.pop();
18                st.push(a*b);
19            }
20            else if(num.equals("/")){
21                int a=st.pop();
22                int b=st.pop();
23                st.push(b/a);
24            }else{
25                int n=Integer.parseInt(num);
26                st.push(n);
27            }
28        }
29        return st.pop();
30    }
31}