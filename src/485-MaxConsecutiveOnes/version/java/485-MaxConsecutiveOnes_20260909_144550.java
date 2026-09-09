// Last updated: 09/09/2026, 14:45:50
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int m=0;
4        int a=0;
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]==1){
7                m++;
8            }else{
9                a=Math.max(a,m);
10                m=0;
11            }
12        }
13        a=Math.max(a,m);
14        return a;
15    }
16}