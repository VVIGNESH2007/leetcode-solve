// Last updated: 7/24/2026, 9:52:03 AM
1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3        if (s.length() != t.length()) return false;
4
5        HashMap<Character, Character> mapStoT = new HashMap<>();
6        HashMap<Character, Character> mapTtoS = new HashMap<>();
7
8        for (int i = 0; i < s.length(); i++) {
9            char charS = s.charAt(i);
10            char charT = t.charAt(i);
11
12            if (mapStoT.containsKey(charS) && mapStoT.get(charS) != charT) {
13                return false;
14            }
15
16            if (mapTtoS.containsKey(charT) && mapTtoS.get(charT) != charS) {
17                return false;
18            }
19
20            mapStoT.put(charS, charT);
21            mapTtoS.put(charT, charS);
22        }
23
24        return true;
25    }
26}
27