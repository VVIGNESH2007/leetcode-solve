// Last updated: 7/27/2026, 2:15:12 PM
1class Solution {
2    public boolean isHappy(int n) {
3        if(n<4&&n!=1){
4            return false;
5        }
6        Stack<Integer> st=new Stack<>();
7        while(n>=4&&!st.contains(n)){
8            st.push(n);
9            int sum=0;
10            while(n!=0){
11                int l=n%10;
12                sum+=l*l;
13                n=n/10;
14            }
15            n=sum;
16        }
17        return n==1;
18    }
19}