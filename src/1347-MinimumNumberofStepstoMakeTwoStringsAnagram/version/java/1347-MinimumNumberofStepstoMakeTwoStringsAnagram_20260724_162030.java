// Last updated: 7/24/2026, 4:20:30 PM
1class Solution {
2    public int minSteps(String s, String t) {
3        Map<Character,Integer> mp1=new HashMap<>();
4        Map<Character,Integer> mp2=new HashMap<>();
5        int ans=0;
6        for(int i=0;i<s.length();i++){
7            char c1=s.charAt(i);
8            char c2=t.charAt(i);
9            mp1.put(c1,mp1.getOrDefault(c1,0)+1);
10            mp2.put(c2,mp2.getOrDefault(c2,0)+1);
11        }
12        Set<Character> st=new HashSet<>();
13        for(int i=0;i<t.length();i++){
14            st.add(t.charAt(i));
15        }
16        for(char ch: st){
17            int countInS = mp1.getOrDefault(ch, 0);
18            int countInT = mp2.get(ch);
19            if (countInT > countInS) {
20                ans += (countInT - countInS);
21            }
22        }
23        return ans;
24    }
25}