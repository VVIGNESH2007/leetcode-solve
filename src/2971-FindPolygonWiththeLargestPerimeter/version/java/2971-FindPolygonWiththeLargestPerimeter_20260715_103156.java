// Last updated: 7/15/2026, 10:31:56 AM
1class Solution {
2    public long largestPerimeter(int[] nums) {
3        Arrays.sort(nums);
4        int i=0;
5        int j=nums.length-1;
6        while(j>1){
7            long sum=0;
8            for(int k=0;k<j;k++){
9                sum+=(long)nums[k];
10            }
11            if(sum<=nums[j]){
12                j--;
13            }else{
14                return sum+nums[j];
15            }
16        }
17        return -1;
18    }
19}