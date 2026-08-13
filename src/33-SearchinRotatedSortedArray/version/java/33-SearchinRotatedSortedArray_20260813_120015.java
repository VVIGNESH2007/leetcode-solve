// Last updated: 8/13/2026, 12:00:15 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        int ans=-1;
4        int i=0;
5        int j=nums.length-1;
6        if(nums[i]>target){
7            while(nums[i]>nums[j]){
8                i++;
9            }
10        }else{
11            while(nums[i]>nums[j]){
12                j--;
13            }
14        }
15        while(i<=j){
16            if(nums[i]==target){
17                ans=i;
18                break;
19            }else{
20                i++;
21            }
22        }
23        return ans;
24        
25    }
26}