// Last updated: 7/14/2026, 12:14:36 PM
class Solution {
    public int[] runningSum(int[] nums) {
        
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        
        return nums;
    }
}