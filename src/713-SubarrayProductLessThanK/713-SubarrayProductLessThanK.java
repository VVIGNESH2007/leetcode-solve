// Last updated: 7/14/2026, 12:15:01 PM
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
    if (k <= 1) return 0;

    int totalCount = 0;
    int currentProduct = 1;
    int left = 0;

    for (int right = 0; right < nums.length; right++) {
        currentProduct *= nums[right];

        while (currentProduct >= k) {
            currentProduct /= nums[left];
            left++;
        }

        totalCount += (right - left + 1);
    }

    return totalCount;
  }
}