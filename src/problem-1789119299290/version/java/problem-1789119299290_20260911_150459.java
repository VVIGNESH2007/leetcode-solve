// Last updated: 11/09/2026, 15:04:59
1class Solution {
2    public int totalNumbers(int[] digits) {
3        int n=digits.length;
4        Set<Integer> st=new HashSet<>();
5        for(int i=0;i<n;i++){
6            for(int j=0;j<n;j++){
7                for(int k=0;k<n;k++){
8                    int s=digits[i]*100+digits[j]*10+digits[k];
9                    if(i!=j&&j!=k&&i!=k&&s>99&&s<1000&&s%2==0){
10                        st.add(s);
11                    }
12                }
13            }
14        }
15        return st.size();
16
17    }
18}