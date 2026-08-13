// Last updated: 8/13/2026, 12:39:00 PM
1class Solution {
2    public int findMin(int[] nums) {
3        int prev=0;
4        int i=0;
5        int j=nums.length-1;
6        if(nums[i]<=nums[j]){
7            return nums[i];
8        }
9        while(nums[i]>nums[j]){
10            prev=nums[j];
11            j--;
12        }
13        return prev;
14    }
15}