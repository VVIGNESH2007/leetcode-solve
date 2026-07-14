// Last updated: 7/14/2026, 12:15:23 PM
class Solution {
    public String decodeString(String s) {
        Stack<Integer> st=new Stack<>();
        Stack<StringBuilder> sbs=new Stack<>();
        int k=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                k=k*10+(c-'0');
            }
            else if(c=='['){
                st.push(k);
                sbs.push(sb);
                k=0;
                sb=new StringBuilder();
            }else if(c==']'){
                StringBuilder decode=sbs.pop();
                for(int j=st.pop();j>=1;j--){
                    decode.append(sb);
                }
                sb=decode;
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}