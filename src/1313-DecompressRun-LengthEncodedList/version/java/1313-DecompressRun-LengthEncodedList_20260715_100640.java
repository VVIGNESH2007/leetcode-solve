// Last updated: 7/15/2026, 10:06:40 AM
1class Solution {
2    public int[] decompressRLElist(int[] nums) {
3        int l=0;
4        int i=0;
5        int n=nums.length;
6        while(i<n){
7            l+=nums[i];
8            i+=2;
9        }
10        int[]arr=new int[l];
11        i=1;
12        int k=0;
13        while(i<n){
14            for(int j=0;j<nums[i-1];j++){
15                arr[k++]=nums[i];
16            }
17            i+=2;
18        }
19        return arr;
20    }
21}