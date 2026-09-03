// Last updated: 9/3/2026, 11:09:33 AM
1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3        Stack<Integer> st=new Stack<>();
4        HashMap<Integer,Integer> mp=new HashMap<>();
5        for(int n:nums2){
6            while(!st.isEmpty()&&st.peek()<n){
7                mp.put(st.pop(),n);
8            }
9            st.push(n);
10        }
11        while(!st.isEmpty()){
12            mp.put(st.pop(),-1);
13        }
14        int[]ans=new int[nums1.length];
15        int i=0;
16        for(int n:nums1){
17            ans[i++]=mp.get(n);
18        }
19        return ans;
20    }
21}