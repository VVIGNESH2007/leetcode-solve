// Last updated: 7/14/2026, 12:14:48 PM
class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(a=='('){
                st.push(a);
            }
            else{
                if(!st.isEmpty()&&st.peek()=='('){
                    st.pop();
                }
                else{
                    if(!st.isEmpty()){
                        st.pop();
                    }
                    count++;
                }
            }
        }
        return st.size()+count;
    }
}