// Last updated: 8/5/2026, 11:17:29 AM
1class Solution {
2    public boolean judgeCircle(String moves) {
3        Map<Character,Integer> mp=new HashMap<>();
4        int n=moves.length();
5        for(int i=0;i<n;i++){
6            char ch=moves.charAt(i);
7            mp.put(ch,mp.getOrDefault(ch,0)+1);
8        }
9        if(mp.getOrDefault('U', 0).equals(mp.getOrDefault('D', 0))&&mp.getOrDefault('R', 0).equals(mp.getOrDefault('L', 0))){
10            return true;
11        }
12        return false;
13    }
14}