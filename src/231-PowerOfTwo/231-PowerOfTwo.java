// Last updated: 7/14/2026, 12:15:47 PM
class Solution {
    public boolean isPowerOfTwo(int n) {

        if(n<=0){
            return false;
        }
        return (n&n-1)==0;
        
    }
}
        