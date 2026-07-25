// Last updated: 7/25/2026, 12:19:29 PM
1import java.util.Arrays;
2
3class Solution {
4    public int minimumPushes(String word) {
5        // Step 1: Count frequency of each lowercase English letter
6        int[] frequencies = new int[26];
7        for (int i = 0; i < word.length(); i++) {
8            frequencies[word.charAt(i) - 'a']++;
9        }
10
11        // Step 2: Sort frequencies in ascending order
12        Arrays.sort(frequencies);
13
14        int totalPushes = 0;
15        int distinctCount = 0;
16
17        // Step 3: Iterate backwards from the most frequent character
18        for (int i = 25; i >= 0; i--) {
19            if (frequencies[i] == 0) break; // No more letters left
20
21            // Grouping by 8 keys:
22            // First 8 distinct letters cost 1 push (distinctCount / 8 = 0 -> multiplier 1)
23            // Next 8 distinct letters cost 2 pushes (distinctCount / 8 = 1 -> multiplier 2)
24            int pushMultiplier = (distinctCount / 8) + 1;
25            
26            totalPushes += frequencies[i] * pushMultiplier;
27            distinctCount++;
28        }
29
30        return totalPushes;
31    }
32}
33