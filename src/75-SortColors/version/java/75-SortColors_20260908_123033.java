// Last updated: 9/8/2026, 12:30:33 PM
1class Solution {
2    public void sortColors(int[] nums) {
3        int i=0;
4        int j=0;
5        int k=nums.length-1;
6        while(j<=k){
7            if(nums[j]==0){
8                int t=nums[i];
9                nums[i]=nums[j];
10                nums[j]=t;
11                i++;
12                j++;
13            }else if(nums[j]==2){
14                int t=nums[k];
15                nums[k]=nums[j];
16                nums[j]=t;
17                k--;
18            }else{
19                j++;
20            }
21        }
22    }
23}