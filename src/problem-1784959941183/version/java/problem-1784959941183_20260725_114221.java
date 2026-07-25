// Last updated: 7/25/2026, 11:42:21 AM
1class Solution {
2    public int sumDistance(int[] nums, String s, int d) {
3        int n = nums.length;
4        long[] finalPositions = new long[n];
5        long MOD = 1_000_000_007;
6        for (int i = 0; i < n; i++) {
7            if (s.charAt(i) == 'R') {
8                finalPositions[i] = (long) nums[i] + d;
9            } else {
10                finalPositions[i] = (long) nums[i] - d;
11            }
12        }
13        Arrays.sort(finalPositions);
14        long totalDistanceSum = 0;
15        long prefixSum = 0;
16
17        for (int i = 0; i < n; i++) {
18            long currentContribution = (finalPositions[i] * i) - prefixSum;
19            totalDistanceSum = (totalDistanceSum + currentContribution) % MOD;
20            prefixSum += finalPositions[i];
21        }
22
23        return (int) totalDistanceSum;
24    }
25}
26