// Last updated: 7/21/2026, 11:27:29 AM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        Set<Character> st=new HashSet<>();
4        int l=0;
5        int ml=0;
6        for(int r=0;r<s.length();r++){
7            while(st.contains(s.charAt(r))){
8                st.remove(s.charAt(l));
9                l++;
10            }
11            st.add(s.charAt(r));
12            ml=Math.max(ml,r-l+1);  
13        }
14        return ml;
15    }
16}