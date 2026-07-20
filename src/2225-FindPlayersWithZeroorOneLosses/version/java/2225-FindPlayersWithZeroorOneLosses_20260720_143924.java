// Last updated: 7/20/2026, 2:39:24 PM
1class Solution {
2    public List<List<Integer>> findWinners(int[][] matches) {
3        Map<Integer,Integer> mp=new HashMap<>();
4        List<List<Integer>> res=new ArrayList<>();
5        int n=matches.length;
6        for(int i=0;i<n;i++){
7            int f=matches[i][0];
8            int s=matches[i][1];
9            mp.put(f,mp.getOrDefault(f,0));
10            mp.put(s,mp.getOrDefault(s,0)+1);
11        }
12        res.add(new ArrayList<>());
13        res.add(new ArrayList<>());
14        for(Map.Entry<Integer,Integer> d:mp.entrySet()){
15            if(d.getValue()==0){
16                res.get(0).add(d.getKey());
17            }
18            else if(d.getValue()==1){
19                res.get(1).add(d.getKey());
20            }
21        }
22        Collections.sort(res.get(0));
23        Collections.sort(res.get(1));
24        return res;
25    }
26}