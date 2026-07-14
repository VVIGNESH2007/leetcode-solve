// Last updated: 7/14/2026, 12:15:31 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0){
            return false;
        }
        if((n&n-1)==0){
            // /check the position of 1 if the position is even return true else false
            int count =0;
            while((n&1)!=1){
                n=n>>1;
                count++;
            }
            if(count%2==0){
                return true;
            }
            else{
                return false;
            }
        }

        return false;
    }
}