// Last updated: 7/14/2026, 12:15:15 PM
import java.util.*;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            // Already visited
            if (nums[index] < 0) {
                result.add(index + 1);
            } 
            else {
                nums[index] = -nums[index];
            }
        }
        return result;
    }
}