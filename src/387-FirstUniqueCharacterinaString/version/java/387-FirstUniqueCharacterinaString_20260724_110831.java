// Last updated: 7/24/2026, 11:08:31 AM
1class Solution {
2    public int firstUniqChar(String s) {
3        Map<Character,Integer> mp=new HashMap<>();
4        int n=s.length();
5        for(int i=0;i<n;i++){
6            char ch=s.charAt(i);
7            mp.put(ch,mp.getOrDefault(ch,0)+1);
8        }
9        for(int i=0;i<n;i++){
10            char ch=s.charAt(i);
11            if(mp.get(ch)==1){
12                return i;
13            }
14        }
15        return -1;
16    }
17}