// Last updated: 7/14/2026, 12:15:29 PM
class Solution {
    public void reverseString(char[] s) {
        int a=0;
        int b=s.length-1;
        char k='a';
        while(a<b){
            k=s[a];
            s[a]=s[b];
            s[b]=k;
            a++;
            b--;
        }
    }
}