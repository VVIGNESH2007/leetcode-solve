// Last updated: 8/14/2026, 2:20:11 PM
1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3        int n=nums.length;
4        if(n==1)return nums[0];
5        int i=0;
6        int j=nums.length-1;
7        while(i<=j){
8            if(nums[i]!=nums[i+1]){
9                return nums[i];
10            }
11            if(nums[j]!=nums[j-1]){
12                return nums[j];
13            }
14            i+=2;
15            j-=2;
16        }
17        return 0;
18    }
19}