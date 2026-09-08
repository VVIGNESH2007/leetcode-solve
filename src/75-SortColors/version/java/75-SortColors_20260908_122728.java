// Last updated: 9/8/2026, 12:27:28 PM
1class Solution {
2    public void sortColors(int[] nums) {
3
4        int low = 0;
5        int mid = 0;
6        int high = nums.length - 1;
7        while (mid <= high) {
8            if (nums[mid] == 0) {
9                // swap low and mid
10                int temp = nums[low];
11                nums[low] = nums[mid];
12                nums[mid] = temp;
13
14                low++;
15                mid++;
16
17            } 
18            else if (nums[mid] == 1) {
19
20                mid++;
21
22            } 
23            else { // nums[mid] == 2
24
25                // swap mid and high
26                int temp = nums[mid];
27                nums[mid] = nums[high];
28                nums[high] = temp;
29
30                high--;
31            }
32        }
33    }
34}