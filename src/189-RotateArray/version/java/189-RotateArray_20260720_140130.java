// Last updated: 7/20/2026, 2:01:30 PM
1class Solution {
2    public void rotate(int[] nums, int k) {
3
4        int n = nums.length;
5        k = k % n;
6        reverse(nums, 0, n - 1);
7        reverse(nums, 0, k - 1);
8        reverse(nums, k, n - 1);
9    }
10
11
12    private void reverse(int[] nums, int start, int end) {
13
14        while (start < end) {
15
16            int temp = nums[start];
17            nums[start] = nums[end];
18            nums[end] = temp;
19
20            start++;
21            end--;
22        }
23    }
24}