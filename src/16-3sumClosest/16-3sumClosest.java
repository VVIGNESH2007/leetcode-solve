// Last updated: 7/14/2026, 12:17:37 PM
import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int cs = nums[0] + nums[1] + nums[2]; // initial closest sum

        for (int i = 0; i < n - 2; i++) {
            int l = i + 1;
            int r = n - 1;

            while (l < r) {  // <-- missing loop
                int sum = nums[i] + nums[l] + nums[r];

                if (Math.abs(target - cs) > Math.abs(target - sum)) {
                    cs = sum; // update closest sum
                }

                if (sum < target) {
                    l++; // move left pointer forward
                } else if (sum > target) {
                    r--; // move right pointer backward
                } else {
                    return sum; // exact match found
                }
            }
        }
        return cs;
    }
}
