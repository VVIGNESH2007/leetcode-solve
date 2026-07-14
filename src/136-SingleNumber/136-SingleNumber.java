// Last updated: 7/14/2026, 12:16:21 PM
class Solution {
    public int singleNumber(int[] nums) {
        int r=0;
        for(int i=0;i<nums.length;i++){
            r^=nums[i];
        }
        return r;
    }
}