// Last updated: 7/14/2026, 12:14:52 PM
class Solution {
    public String stackToString(String s){
        int i=0;
        Stack<Character> st =  new Stack<>();
        while(i<s.length()){
            if(s.charAt(i)=='#' )
            {
                if (!st.isEmpty()) {
                       st.pop();
                }     
            }
            else{
                st.push(s.charAt(i));
            }
            i++;
        }
        StringBuilder sb =  new  StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
    public boolean backspaceCompare(String s, String t) {
        String s1=stackToString(s);
        String s2=stackToString(t);

        return s1.equals(s2);

    }
}
