// Last updated: 8/17/2026, 4:07:36 PM
1class Solution {
2    public int longestMountain(int[] arr) {
3        int n = arr.length;
4
5        int[] left = new int[n];  
6        int[] right = new int[n];
7
8        for (int i = 0; i < n; i++) {
9            left[i] = 1;
10            right[i] = 1;
11        }
12
13        for (int i = 1; i < n; i++) {
14            if (arr[i] > arr[i - 1]) left[i] += left[i - 1];
15        }
16
17        for (int i = n - 2; i >= 0; i--) {
18            if (arr[i] > arr[i + 1]) right[i] += right[i + 1];
19        }
20
21        int maxi = 0;
22
23        for (int i = 0; i < n; i++) {
24            if (left[i] > 1 && right[i] > 1)
25                maxi = Math.max(maxi, left[i] + right[i] - 1);
26        }
27
28        return maxi;
29    }
30}