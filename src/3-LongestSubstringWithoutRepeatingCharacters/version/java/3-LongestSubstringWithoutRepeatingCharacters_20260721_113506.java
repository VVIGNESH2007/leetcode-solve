// Last updated: 7/21/2026, 11:35:06 AM
1import java.util.HashMap;
2import java.util.Map;
3
4class Solution {
5    public int lengthOfLongestSubstring(String s) {
6        // Map to store: Character -> Its most recent index
7        Map<Character, Integer> map = new HashMap<>();
8        int maxLength = 0;
9        int left = 0;
10        
11        for (int right = 0; right < s.length(); right++) {
12            char currentChar = s.charAt(right);
13            
14            // If the character was seen before, and is inside our current window
15            if (map.containsKey(currentChar)) {
16                // Jump the left pointer directly past the previous instance
17                left = Math.max(left, map.get(currentChar) + 1);
18            }
19            
20            // Update or insert the character's latest index
21            map.put(currentChar, right);
22            
23            // Calculate the current window size and track the maximum
24            maxLength = Math.max(maxLength, right - left + 1);
25        }
26        
27        return maxLength;
28    }
29}
30