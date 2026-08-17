// Last updated: 8/17/2026, 3:54:20 PM
1class Solution {
2    public int longestMountain(int[] arr) {
3        int n = arr.length;
4
5        int[] left = new int[n];   // increasing run ending at i
6        int[] right = new int[n];  // decreasing run starting at i
7
8        for (int i = 0; i < n; i++) {
9            left[i] = 1;
10            right[i] = 1;
11        }
12
13        // climb from the left: extend the run if we're still going up
14        for (int i = 1; i < n; i++) {
15            if (arr[i] > arr[i - 1]) left[i] += left[i - 1];
16        }
17
18        // climb from the right: extend the run if we're still going down
19        for (int i = n - 2; i >= 0; i--) {
20            if (arr[i] > arr[i + 1]) right[i] += right[i + 1];
21        }
22
23        int maxi = 0;
24
25        // a peak needs BOTH sides (> 1 each); peak counted once, hence -1
26        for (int i = 0; i < n; i++) {
27            if (left[i] > 1 && right[i] > 1)
28                maxi = Math.max(maxi, left[i] + right[i] - 1);
29        }
30
31        return maxi;
32    }
33}