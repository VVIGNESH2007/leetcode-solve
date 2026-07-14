// Last updated: 7/14/2026, 12:15:18 PM
public class Solution {
    public int characterReplacement(String s, int k) {
        int[] counts = new int[26]; // Stores frequencies of characters A-Z
        int left = 0;
        int maxCount = 0; // Highest frequency of a single character in the current window
        int maxLength = 0;
        
        for (int right = 0; right < s.length(); right++) {
            // Include the current character in the window frequency map
            counts[s.charAt(right) - 'A']++;
            
            // Update the frequency of the most common character seen so far in the window
            maxCount = Math.max(maxCount, counts[s.charAt(right) - 'A']);
            
            // Current window size = right - left + 1
            // Number of replacements needed = window size - maxCount
            // If replacements exceed k, shrink the window from the left
            if ((right - left + 1) - maxCount > k) {
                counts[s.charAt(left) - 'A']--;
                left++;
            }
            
            // Track the maximum size of a valid window found
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}
