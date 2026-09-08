// Last updated: 9/8/2026, 9:36:34 AM
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int i=0;
4        int j=numbers.length-1;
5        int[]res=new int[2];
6        while(j<numbers.length){
7            int sum =numbers[i]+numbers[j];
8            if(sum==target){
9                res[0]=i+1;
10                res[1]=j+1;
11                break;
12            }
13            if(sum<target){
14                i++;
15            }
16            if(sum>target){
17                j--;
18            }
19           
20
21        }
22        return res;
23    }
24}