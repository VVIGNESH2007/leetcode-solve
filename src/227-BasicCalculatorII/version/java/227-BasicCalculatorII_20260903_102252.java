// Last updated: 9/3/2026, 10:22:52 AM
1class Solution {
2    public int calculate(String s) {
3        Stack<Integer> st=new Stack<>();
4        int num=0;
5        char sign='+';
6        for(int i=0;i<s.length();i++){
7            char ch=s.charAt(i);
8            if(Character.isDigit(ch)){
9                num=num*10+(ch-'0');
10            }
11            if(!Character.isDigit(ch)&&ch!=' '||i==s.length()-1){
12                if(sign=='+'){
13                    st.push(num);
14                }else if(sign=='-'){
15                    st.push(-num);
16                }else if(sign=='*'){
17                    st.push(st.pop()*num);
18                }
19                else if(sign=='/'){
20                    st.push(st.pop()/num);
21                }
22                sign=ch;
23                num=0;
24            }
25        }
26        int ans=0;
27        for(int n:st){
28            ans+=n;
29        }
30        return ans;
31    }
32}