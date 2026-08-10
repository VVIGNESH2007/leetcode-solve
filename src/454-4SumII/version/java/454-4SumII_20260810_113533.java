// Last updated: 8/10/2026, 11:35:33 AM
1class Solution {
2    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
3        Map<Integer,Integer> mp=new HashMap<>();
4        for(int n:nums1){
5            for(int m:nums2){
6                int sum=n+m;
7                mp.put(sum,mp.getOrDefault(sum,0)+1);
8            }
9        }
10        int n=0;
11        for(int k:nums3){
12            for(int m:nums4){
13                int sum=-(k+m);
14                n+=mp.getOrDefault(sum,0);
15            }
16        }
17        return n;
18    }
19}