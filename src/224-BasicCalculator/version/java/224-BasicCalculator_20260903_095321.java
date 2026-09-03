// Last updated: 9/3/2026, 9:53:21 AM
1class Solution {
2    public int calculate(String s) {
3        Stack<Integer> st=new Stack<>();
4        int res=0;
5        int num=0;
6        int sign=1;
7        for(int i=0;i<s.length();i++){
8            char ch=s.charAt(i);
9            if(Character.isDigit(ch)){
10                num=num*10+(ch-'0');
11            }
12            else if(ch=='+'){
13                res=res+(num*sign);
14                sign=1;
15                num=0;
16            }
17            else if(ch=='-'){
18                res=res+(num*sign);
19                sign=-1;
20                num=0;
21            }
22            else if(ch=='('){
23                st.push(res);
24                st.push(sign);
25                res=0;
26                sign=1;
27            }else if(ch==')'){
28                res=(num*sign)+res;
29                int press=st.pop();
30                int prenum=st.pop();
31                res=(res*press)+prenum;
32                num=0;
33                sign=1;
34            }
35        }
36        return res+(sign*num);
37    }
38}