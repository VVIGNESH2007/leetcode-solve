// Last updated: 8/14/2026, 1:46:57 PM
1class Solution {
2    public int lengthOfLIS(int[] nums) {
3        if (nums == null || nums.length == 0) {
4            return 0;
5        }
6
7        int n = nums.length;
8        int[] dp = new int[n];
9        
10        // Every single element is an increasing subsequence of length 1
11        Arrays.fill(dp, 1);
12        
13        int maxLength = 1; // Tracks the overall maximum length found
14
15        // Outer loop: Choose the current ending element
16        for (int i = 1; i < n; i++) {
17            // Inner loop: Look back at all previous elements
18            for (int j = 0; j < i; j++) {
19                // If the current element is strictly greater, we can extend the sequence
20                if (nums[j] < nums[i]) {
21                    dp[i] = Math.max(dp[i], dp[j] + 1);
22                }
23            }
24            // Keep track of the longest subsequence seen so far
25            maxLength = Math.max(maxLength, dp[i]);
26        }
27
28        return maxLength;
29    }
30}