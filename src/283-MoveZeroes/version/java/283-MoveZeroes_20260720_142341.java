// Last updated: 7/20/2026, 2:23:41 PM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int i=0;
4        int j=0;
5        while(j<nums.length){
6            if(nums[j]==0){
7                j++;
8            }
9            else{
10                int t=nums[j];
11                nums[j]=nums[i];
12                nums[i]=t;
13                i++;
14                j++;
15            }
16            
17        }
18    }
19}