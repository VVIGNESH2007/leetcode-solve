// Last updated: 7/16/2026, 9:35:12 AM
1class Solution {
2    public List<List<Integer>> findWinners(int[][] matches) {
3        Map<Integer,Integer> fw=new HashMap<>();
4        int n=matches.length;
5        for(int i=0;i<n;i++){
6            int a=matches[i][0];
7            int b=matches[i][1];
8            fw.put(a,fw.getOrDefault(a,0));
9            fw.put(b,fw.getOrDefault(b,0)+1);
10        }
11        List<List<Integer>> wh=new ArrayList<>();
12        wh.add(new ArrayList<>());
13        wh.add(new ArrayList<>());
14        for(Map.Entry<Integer,Integer> mgr:fw.entrySet()){
15            if(mgr.getValue()==0){
16                wh.get(0).add(mgr.getKey());
17            }else if(mgr.getValue()==1){
18                wh.get(1).add(mgr.getKey());
19            }
20        }
21        Collections.sort(wh.get(0));
22        Collections.sort(wh.get(1));
23        return wh;
24    }
25}