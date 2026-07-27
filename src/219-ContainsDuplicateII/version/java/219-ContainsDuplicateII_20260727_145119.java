// Last updated: 7/27/2026, 2:51:19 PM
1class Solution {
2    public boolean containsNearbyDuplicate(int[] nums, int k) {
3        int n=nums.length;
4        Map<Integer,Integer> mp=new HashMap<>();
5        for(int i=0;i<n;i++){
6            int g=nums[i];
7            if(mp.containsKey(g)){
8                if(Math.abs(i-mp.get(g))<=k){
9                    return true;
10                }else{
11                    mp.remove(g);
12                }
13            }
14            mp.put(g,i);
15        }
16        return false;
17    }
18}