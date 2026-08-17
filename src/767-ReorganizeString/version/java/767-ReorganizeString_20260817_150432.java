// Last updated: 8/17/2026, 3:04:32 PM
1class Solution {
2        public String reorganizeString(String S) {
3        int[] hash = new int[26];
4        for (int i = 0; i < S.length(); i++) {
5            hash[S.charAt(i) - 'a']++;
6        } 
7        int max = 0, letter = 0;
8        for (int i = 0; i < hash.length; i++) {
9            if (hash[i] > max) {
10                max = hash[i];
11                letter = i;
12            }
13        }
14        if (max > (S.length() + 1) / 2) {
15            return ""; 
16        }
17        char[] res = new char[S.length()];
18        int idx = 0;
19        while (hash[letter] > 0) {
20            res[idx] = (char) (letter + 'a');
21            idx += 2;
22            hash[letter]--;
23        }
24        for (int i = 0; i < hash.length; i++) {
25            while (hash[i] > 0) {
26                if (idx >= res.length) {
27                    idx = 1;
28                }
29                res[idx] = (char) (i + 'a');
30                idx += 2;
31                hash[i]--;
32            }
33        }
34        return String.valueOf(res);
35    }
36}