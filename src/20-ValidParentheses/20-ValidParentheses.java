// Last updated: 7/14/2026, 12:17:34 PM
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                st.push(s.charAt(i));
                i++;
            }
            else if(s.charAt(i)==')'){
                if(st.size()==0||st.peek()!='('){
                    return false;
                }
                st.pop();
                i++;
            }
            else if(s.charAt(i)=='}'){
                if(st.size()==0||st.peek()!='{'){
                    return false;
                }
                st.pop();
                i++;
            }
            else if(s.charAt(i)==']'){
                if(st.size()==0||st.peek()!='['){
                    return false;
                }
                st.pop();
                i++;
            }
        }
        return st.isEmpty();
    }
}