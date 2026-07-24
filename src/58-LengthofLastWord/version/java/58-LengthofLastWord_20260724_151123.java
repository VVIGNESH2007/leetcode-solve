// Last updated: 7/24/2026, 3:11:23 PM
1class Solution {
2    public int lengthOfLastWord(String s) {
3        Stack<String> st=new Stack<>();
4        int i=0;
5        int n=s.length();
6        while(s.charAt(i)==' '){
7            i++;
8        }
9        int j=i;
10        while(j<n){
11            while(j!=n&&s.charAt(j)!=' '){
12                j++;
13            }
14            st.push(s.substring(i,j));
15            while(j<n&&s.charAt(j)==' '){
16                j++;
17            }
18            i=j;
19        }
20        return st.peek().length();
21    }
22}