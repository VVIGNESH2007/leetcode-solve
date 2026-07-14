// Last updated: 7/14/2026, 12:15:48 PM
class Solution {
    public int calculate(String s) {

        Stack<Integer> st = new Stack<>();
        int num = 0;
        char sign = '+';
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // build number
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }
            // if operator or last character
            if ((!Character.isDigit(ch) && ch != ' ') || i == s.length() - 1) {
                if (sign == '+') {
                    st.push(num);
                }
                else if (sign == '-') {
                    st.push(-num);
                }
                else if (sign == '*') {
                    st.push(st.pop() * num);
                }
                else if (sign == '/') {
                    st.push(st.pop() / num);
                }
                // update sign
                sign = ch;
                // reset number
                num = 0;
            }
        }
        // sum all values
        int result = 0;
        while (!st.isEmpty()) {
            result += st.pop();
        }
        return result;
    }
}