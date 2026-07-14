// Last updated: 7/14/2026, 12:17:28 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<nums.length;i++){
            if(!st.contains(nums[i])){
                st.push(nums[i]);
            }
        }
        int p=st.size()-1;
        int q=st.size();
        while(!st.isEmpty()){
            nums[p--]=st.pop();
        }
        return q;
    }
}