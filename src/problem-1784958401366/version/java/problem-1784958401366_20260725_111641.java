// Last updated: 7/25/2026, 11:16:41 AM
1class Solution {
2    public String rle(String s){
3        int n=s.length();
4        StringBuilder sb=new StringBuilder();
5        Stack<Character> st=new Stack<>();
6        int i=0;
7        while(i<n){
8            char v=s.charAt(i);
9            st.push(s.charAt(i));
10            i++;
11            while(i<n&&st.contains(s.charAt(i))){
12                st.push(s.charAt(i));
13                i++;
14            }
15            sb.append(st.size());
16            sb.append(st.peek());
17            st.clear();
18        }
19        return sb.toString();
20    }
21    public String countAndSay(int n) {
22        String[]dp=new String[n];
23        dp[0]="1";
24        for(int i=1;i<n;i++){
25            dp[i]=rle(dp[i-1]);
26        }
27        return dp[n-1];
28    }
29}