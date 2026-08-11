// Last updated: 8/11/2026, 3:15:44 PM
1import java.util.HashMap;
2import java.util.Map;
3
4class Solution {
5    public long maximumSubarraySum(int[] nums, int k) {
6        long maxSubarraySum = Long.MIN_VALUE;
7        long currentPrefixSum = 0;
8        
9        // Maps element value -> minimum prefix sum seen BEFORE this element
10        Map<Integer, Long> minPrefixMap = new HashMap<>();
11        
12        for (int num : nums) {
13            // Update prefix sum to include the current element
14            currentPrefixSum += num;
15            
16            // Target 1: nums[i] = num - k
17            if (minPrefixMap.containsKey(num - k)) {
18                long prevMinPrefix = minPrefixMap.get(num - k);
19                // Subarray sum = currentPrefixSum - (prefix sum right before nums[i])
20                maxSubarraySum = Math.max(maxSubarraySum, currentPrefixSum - prevMinPrefix);
21            }
22            
23            // Target 2: nums[i] = num + k
24            if (minPrefixMap.containsKey(num + k)) {
25                long prevMinPrefix = minPrefixMap.get(num + k);
26                maxSubarraySum = Math.max(maxSubarraySum, currentPrefixSum - prevMinPrefix);
27            }
28            
29            // Store or update the map with the minimum prefix sum BEFORE the next elements
30            // We store (currentPrefixSum - num) which represents the prefix sum exclusive of 'num'
31            long prefixBeforeCurrent = currentPrefixSum - num;
32            if (!minPrefixMap.containsKey(num) || prefixBeforeCurrent < minPrefixMap.get(num)) {
33                minPrefixMap.put(num, prefixBeforeCurrent);
34            }
35        }
36        
37        return maxSubarraySum == Long.MIN_VALUE ? 0 : maxSubarraySum;
38    }
39}
40