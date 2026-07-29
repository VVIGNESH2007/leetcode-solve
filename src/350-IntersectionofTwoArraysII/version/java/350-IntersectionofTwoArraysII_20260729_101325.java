// Last updated: 7/29/2026, 10:13:25 AM
1class Solution {
2    public int[] intersect(int[] nums1, int[] nums2) {
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
13        Stack<Integer> st=new Stack<>();
14        for(int i=0;i<1001;i++){
15            if(arr[i]!=0&&brr[i]!=0&&arr[i]>=brr[i]){
16                for(int k=0;k<brr[i];k++){
17                    st.push(i);
18                }
19            }else if(arr[i]!=0&&brr[i]!=0&&arr[i]<brr[i]){
20                for(int k=0;k<arr[i];k++){
21                    st.push(i);
22                }
23            }
24        }
25        int m=0;
26        int[]res=new int[st.size()];
27        for(int k:st){
28           res[m++]=k;
29        }
30        return res;
31        
32    }
33}