// Last updated: 7/21/2026, 11:07:07 AM
1import java.util.HashSet;
2import java.util.Set;
3
4public class Solution {
5    public int lengthOfLongestSubstring(String s) {
6        Set<Character> charSet = new HashSet<>();
7        int left = 0;
8        int maxLength = 0;
9        
10        for (int right = 0; right < s.length(); right++) {
11            // Shrink the window from the left if a duplicate is found
12            while (charSet.contains(s.charAt(right))) {
13                charSet.remove(s.charAt(left));
14                left++;
15            }
16            
17            // Add the new character to the window
18            charSet.add(s.charAt(right));
19            
20            // Update the maximum length found so far
21            maxLength = Math.max(maxLength, right - left + 1);
22        }
23        
24        return maxLength;
25    }
26}
27