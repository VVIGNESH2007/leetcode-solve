// Last updated: 9/8/2026, 12:40:58 PM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int i=0;
4        for(int j=0;j<nums.length;j++){
5            if(nums[j]!=0){
6                int t=nums[j];
7                nums[j]=nums[i];
8                nums[i]=t;
9                i++;
10            }
11        }
12    }
13}