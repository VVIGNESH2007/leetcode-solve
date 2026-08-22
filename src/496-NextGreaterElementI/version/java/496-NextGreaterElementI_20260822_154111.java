// Last updated: 8/22/2026, 3:41:11 PM
1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3        Stack<Integer> st = new Stack<>();        
4        for(int i=0;i<nums1.length;i++){
5            int br=0;
6            for(int j=0;j<nums2.length;j++){
7                if(br!=0){
8                    break;
9                }
10                int k=j+1;
11                if(nums1[i] == nums2[j]){
12                    while(k<=nums2.length){
13                        if(k==nums2.length){
14                            st.push(-1);
15                            br++;
16                            break;
17                        }
18                        if(nums2[k]>nums2[j]){
19                            st.push(nums2[k]);
20                            br++;
21                            break;
22                        }
23                        k++;
24                    }
25                }
26            }
27        }
28        int[] res = new int[nums1.length];
29        for(int i=res.length - 1;i>=0;i--){
30            if(!st.isEmpty()){
31
32                res[i] = st.pop();
33            }
34        }
35        return res;
36    }
37}