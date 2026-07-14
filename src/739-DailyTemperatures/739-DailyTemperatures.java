// Last updated: 7/14/2026, 12:14:55 PM
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer>st=new Stack<>();
        int n=temperatures.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            int cday=temperatures[i];
            while(st.size()>0&&temperatures[st.peek()]<cday){
                int pday=st.pop();
                ans[pday]=i-pday;
            }
            st.push(i);
        }
        return ans;
    }
}