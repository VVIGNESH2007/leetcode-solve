// Last updated: 9/7/2026, 10:01:34 AM
1class Solution {
2    public int maxDistance(int[] position, int m) {
3        Arrays.sort(position);
4        int lo = 1;
5        int hi = (position[position.length-1]-position[0])/(m-1);
6        int ans = 1;
7        while(lo<=hi)
8        {
9            int mid = lo+(hi-lo)/2;
10            if(canWePlace(position, mid, m))
11            {
12                ans = mid;
13                lo=mid+1;
14            }
15            else
16            {
17                hi = mid-1;
18            }
19        }
20        return ans;
21    }
22    private boolean canWePlace(int[] arr, int dist, int cows)
23    {
24        int cntCows=1;
25        int last = arr[0];
26        for(int i=0;i<arr.length;i++)
27        {
28            if(arr[i]-last>=dist)
29            {
30                cntCows++;
31                last = arr[i];
32            }
33            if(cntCows>=cows)
34            {
35                return true;
36            }
37        }
38        return false;
39    }
40}