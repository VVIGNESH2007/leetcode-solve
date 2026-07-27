// Last updated: 7/27/2026, 3:20:23 PM
1import java.util.*;
2
3class Solution {
4    public int[] topKFrequent(int[] nums, int k) {
5        Map<Integer, Integer> freq = new HashMap<>();
6
7        for (int num : nums) {
8            freq.put(num, freq.getOrDefault(num, 0) + 1);
9        }
10        List<Integer>[] buckets = new List[nums.length + 1];
11
12        for (int num : freq.keySet()) {
13
14            int count = freq.get(num);
15
16            if (buckets[count] == null) {
17                buckets[count] = new ArrayList<>();
18            }
19
20            buckets[count].add(num);
21        }
22        int[] result = new int[k];
23        int index = 0;
24
25        for (int i = buckets.length - 1; i >= 0; i--) {
26
27            if (buckets[i] != null) {
28
29                for (int num : buckets[i]) {
30                    result[index++] = num;
31                    if (index == k) {
32                        return result;
33                    }
34                }
35            }
36        }
37
38        return result;
39    }
40}