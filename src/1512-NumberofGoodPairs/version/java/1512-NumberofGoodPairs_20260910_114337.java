// Last updated: 10/09/2026, 11:43:37
1class Solution {
2    public int numIdenticalPairs(int[] nums) {
3        HashMap<Integer,Integer> mp=new HashMap<>();
4        int ans=0;
5        int n=nums.length;
6        for(int i=0;i<n;i++){
7            if(mp.containsKey(nums[i])){
8                ans+=mp.get(nums[i]);
9            }
10            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
11        }
12        return ans;
13    }
14}