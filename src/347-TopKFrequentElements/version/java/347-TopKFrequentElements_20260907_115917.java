// Last updated: 9/7/2026, 11:59:17 AM
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        HashMap<Integer,Integer> mp=new HashMap<>();
4        for(int n:nums){
5            mp.put(n,mp.getOrDefault(n,0)+1);
6        }
7        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->mp.get(a)-mp.get(b));
8        for(int n:mp.keySet()){
9            pq.add(n);
10            if(pq.size()>k){
11                pq.poll();
12            }
13        }
14        int[]ans=new int [pq.size()];
15        int j=pq.size();
16        for(int i=0;i<j;i++){
17            ans[i]=pq.poll();
18        }
19        return ans;
20    }
21}