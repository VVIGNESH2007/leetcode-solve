// Last updated: 7/14/2026, 12:14:59 PM
class Solution {
    public int pivotIndex(int[] nums) {
        
        int totalSum = 0;
        
        // Step 1: Calculate total sum
        for (int num : nums) {
            totalSum += num;
        }
        
        int leftSum = 0;
        
        // Step 2: Traverse and check pivot condition
        for (int i = 0; i < nums.length; i++) {
            
            int rightSum = totalSum - leftSum - nums[i];
            
            if (leftSum == rightSum) {
                return i;
            }
            
            leftSum += nums[i];
        }
        
        return -1; // No pivot index found
    }
}