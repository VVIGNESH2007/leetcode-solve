// Last updated: 8/14/2026, 12:25:17 PM
1class Solution {
2    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
3        int distanceValue = 0;
4        
5        for (int i = 0; i < arr1.length; i++) {
6            boolean isPassingNode = true; // Assume arr1[i] is valid
7            
8            for (int j = 0; j < arr2.length; j++) {
9                // If it fails even once, mark it bad and stop looking
10                if (Math.abs(arr1[i] - arr2[j]) <= d) {
11                    isPassingNode = false;
12                    break; 
13                }
14            }
15            
16            // If it survived the entire inner loop, we get a point!
17            if (isPassingNode) {
18                distanceValue++;
19            }
20        }
21        
22        return distanceValue;
23    }
24}
25