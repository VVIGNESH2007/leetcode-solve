// Last updated: 7/14/2026, 12:15:09 PM
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int num:nums2){
            while(!st.isEmpty()&&num>st.peek()){
                hs.put(st.pop(),num);
            }
            st.push(num);
        }
        int i=0;
        int[]ans=new int[nums1.length];
        for(int numq:nums1){
            if(hs.containsKey(numq)){
                ans[i++]=hs.get(numq);
            }
            else{
                ans[i++]=-1;
            }
        }
        return ans;
    }
}