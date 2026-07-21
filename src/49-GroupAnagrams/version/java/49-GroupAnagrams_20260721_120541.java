// Last updated: 7/21/2026, 12:05:41 PM
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        Map<String,List<String>> ans=new HashMap<>();
4        for(String s:strs){
5            char[]arr=s.toCharArray();
6            Arrays.sort(arr);
7            String g=new String(arr);
8            ans.putIfAbsent(g,new ArrayList<>());
9            ans.get(g).add(s);
10        }
11        return new ArrayList<>(ans.values());
12    }
13}