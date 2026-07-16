// Last updated: 7/16/2026, 9:14:23 AM
1class Solution {
2    public List<Integer> majorityElement(int[] nums) {
3        Map<Integer,Integer> me=new HashMap<>();
4        for(int i=0;i<nums.length;i++){
5            int no=nums[i];
6            me.put(no,me.getOrDefault(no,0)+1);
7        }
8        int max=nums.length/3;
9        List<Integer> res=new ArrayList<>();
10        for(Map.Entry<Integer,Integer> en:me.entrySet()){
11            if(en.getValue()>max){
12                res.add(en.getKey());
13            }
14        }
15        return res;
16    }
17}