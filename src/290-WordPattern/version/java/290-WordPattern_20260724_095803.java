// Last updated: 7/24/2026, 9:58:03 AM
1class Solution {
2    public boolean wordPattern(String pattern, String s) {
3        String[] words = s.split(" ");
4
5        if (pattern.length() != words.length) {
6            return false;
7        }
8        Map<Character, String> charToWord = new HashMap<>();
9        Map<String, Character> wordToChar = new HashMap<>();
10        
11        for (int i = 0; i < pattern.length(); i++) {
12            char ch = pattern.charAt(i);
13            String word = words[i];
14            
15            // Check character to word mapping
16            if (charToWord.containsKey(ch)) {
17                if (!charToWord.get(ch).equals(word)) {
18                    return false; // 'a' tries to map to two different words
19                }
20            } else {
21                charToWord.put(ch, word);
22            }
23
24            if (wordToChar.containsKey(word)) {
25                if (wordToChar.get(word) != ch) {
26                    return false; 
27                }
28            } else {
29                wordToChar.put(word, ch);
30            }
31        }
32        
33        return true;
34    }
35}
36