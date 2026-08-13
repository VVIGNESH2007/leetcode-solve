// Last updated: 8/13/2026, 12:26:06 PM
1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        int i=0;
4        int j=nums.length-1;
5        int ans=-1;
6        while(i<=j){
7            int mid=(i+j)/2;
8            if(nums[i]==target){
9                ans=i;
10                break;
11            }
12            if(nums[j]==target){
13                ans=j;
14                break;
15            }
16            if(nums[mid]==target){
17                ans=mid;
18                break;
19            }else if(nums[mid]<target){
20                i=mid+1;
21            }else{
22                j=mid-1;
23            }
24        }
25        if(ans==-1){
26            ans=i;
27        }
28        return ans;
29    }
30}