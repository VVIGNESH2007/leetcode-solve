// Last updated: 9/3/2026, 2:44:13 PM
1class Solution {
2    public boolean uniformArray(int[] nums1) {
3        int n=nums1.length;
4        int min=nums1[0];
5        for(int i=0;i<n;i++){
6            if(nums1[i]<min){
7                min=nums1[i];
8            }
9        }
10        if(min%2!=0){
11            return true;
12        }
13        for(int i=0;i<n;i++){
14            if(nums1[i]%2!=0){
15                return false;
16            }
17        }
18        return true;
19    }
20}