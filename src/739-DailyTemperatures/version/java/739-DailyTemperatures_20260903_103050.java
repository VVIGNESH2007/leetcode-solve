// Last updated: 9/3/2026, 10:30:50 AM
1class Solution {
2    public int[] dailyTemperatures(int[] temperatures) {
3        Stack<Integer> st=new Stack<>();
4        int[]ans=new int[temperatures.length];
5        for(int i=0;i<temperatures.length;i++){
6            if(st.isEmpty()){
7                st.push(i);
8            }else{
9                while(!st.isEmpty()&&temperatures[st.peek()]<temperatures[i]){
10                    ans[st.peek()]=i-st.pop();
11                }
12                st.push(i);
13            }
14        }
15        return ans;
16    }
17}