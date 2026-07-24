// Last updated: 7/24/2026, 3:02:28 PM
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
15            j++;
16            i=j;
17        }
18        while(st.peek().length()==0){
19            st.pop();
20        }
21        System.out.print(st.peek());
22        return st.peek().length();
23    }
24}