// Last updated: 9/3/2026, 1:43:38 PM
1class Solution {
2    public int[] nextGreaterElements(int[] nums) {
3        int n=nums.length;
4        int[]ans=new int[n];
5        Arrays.fill(ans,-1);
6        Stack<Integer> st=new Stack<>();
7        for(int i=0;i<n*2;i++){
8            int curr=nums[i%n];
9            while(!st.isEmpty()&&nums[st.peek()]<curr){
10                ans[st.pop()]=curr;
11            }
12            if(i<n){
13                st.push(i);
14            }
15        }
16        return ans;
17    }
18}