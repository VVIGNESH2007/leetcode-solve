// Last updated: 8/10/2026, 11:09:34 AM
1class Solution {
2    public boolean repeatedSubstringPattern(String s) {
3        String doubled = s + s;
4        return doubled.substring(1, doubled.length() - 1).contains(s);
5    }
6}
7