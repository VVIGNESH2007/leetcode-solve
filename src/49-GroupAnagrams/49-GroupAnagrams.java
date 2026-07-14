// Last updated: 7/14/2026, 12:17:10 PM
import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            // Convert string to char array
            char[] chars = str.toCharArray();

            // Sort characters
            Arrays.sort(chars);

            // Create key
            String key = new String(chars);

            // Add string to corresponding group
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }

        // Return all groups
        return new ArrayList<>(map.values());
    }
}