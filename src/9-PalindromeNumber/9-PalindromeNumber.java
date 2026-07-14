// Last updated: 7/14/2026, 12:17:44 PM
class Solution {
    public boolean isPalindrome(int x) {
        int k=x;
        int r=0;
        while(k>0){
            r=r*10+k%10;
            k/=10;
        }
        return r==x;
    }
}