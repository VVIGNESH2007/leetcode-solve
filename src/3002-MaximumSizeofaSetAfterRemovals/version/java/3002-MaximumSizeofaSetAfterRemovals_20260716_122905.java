// Last updated: 7/16/2026, 12:29:05 PM
1class Solution {
2    public int maximumSetSize(int[] nums1, int[] nums2) {
3        Set<Integer> s1=new HashSet<>();
4        Set<Integer> s2=new HashSet<>();
5        for(int i=0;i<nums1.length;i++){
6            s1.add(nums1[i]);
7        }
8        for(int i=0;i<nums2.length;i++){
9            s2.add(nums2[i]);
10        }
11        int n=nums1.length/2;
12        int u1=s1.size();
13        int u2=s2.size();
14        int c=0;
15        for(int num:s1){
16            if(s2.contains(num)){
17                c++;
18            }
19        }
20        u1=u1-c;
21        u2=u2-c;
22        u1=Math.min(u1,n);
23        u2=Math.min(u2,n);
24        return Math.min(u1+u2+c,n*2);
25    }
26}