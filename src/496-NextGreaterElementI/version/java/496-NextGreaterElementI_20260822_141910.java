// Last updated: 8/22/2026, 2:19:10 PM
1class Solution {
2    public  int ng(int[] arr,int s){{
3        int n=arr.length;
4        int ans=-1;
5        for(int i=s+1;i<n;i++){
6            if(arr[i]>arr[s]){
7                ans=arr[i];
8                break;
9            }
10        }
11        return ans;
12    }
13
14    }
15    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
16        int n=nums1.length;
17        Map<Integer,Integer>mp=new HashMap<>();
18        int ans[]=new int[n];
19        for(int i=0;i<n;i++){
20            mp.put(nums1[i],i);
21        }
22        int in=0;
23        for(int i=0;i<nums2.length;i++){
24            if(mp.containsKey(nums2[i])){
25                int p=ng(nums2,i);
26                ans[mp.get(nums2[i])]=p;
27            }
28        }
29        return ans;
30    }
31}