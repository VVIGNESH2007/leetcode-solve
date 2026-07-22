// Last updated: 7/22/2026, 11:38:47 AM
1import java.util.Arrays;
2
3class Solution {
4    public boolean closeStrings(String word1, String word2) {
5        if (word1.length() != word2.length()) {
6            return false;
7        }
8        int[] freq1 = new int[26];
9        int[] freq2 = new int[26];
10        for (int i = 0; i < word1.length(); i++) {
11            freq1[word1.charAt(i) - 'a']++;
12            freq2[word2.charAt(i) - 'a']++;
13        }
14        for (int i = 0; i < 26; i++) {
15            if ((freq1[i] == 0 && freq2[i] != 0) || (freq1[i] != 0 && freq2[i] == 0)) {
16                return false;
17            }
18        }
19        Arrays.sort(freq1);
20        Arrays.sort(freq2);
21
22        return Arrays.equals(freq1, freq2);
23    }
24}
25