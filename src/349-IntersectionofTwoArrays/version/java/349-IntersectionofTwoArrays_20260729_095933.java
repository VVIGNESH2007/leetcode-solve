// Last updated: 7/29/2026, 9:59:33 AM
1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        int []arr=new int[1001];
4        int []brr=new int[1001];
5        for(int i=0;i<nums1.length;i++){
6            int n=nums1[i];
7            arr[n]++;
8        }
9        for(int i=0;i<nums2.length;i++){
10            int n=nums2[i];
11            brr[n]++;
12        }
13        Set<Integer> st=new HashSet<>();
14        for(int i=0;i<1001;i++){
15            if(arr[i]!=0&&brr[i]!=0){
16                st.add(i);
17            }
18        }
19        int m=0;
20        int[]res=new int[st.size()];
21        for(int k:st){
22           res[m++]=k;
23        }
24        return res;
25        
26    }
27}