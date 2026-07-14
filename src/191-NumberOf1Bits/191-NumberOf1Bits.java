// Last updated: 7/14/2026, 12:16:04 PM
class Solution {
    public int hammingWeight(int n) {
        int count=0;
        // for(int i=0;i<n;i++){
        //     if((n&(>>i))==1){
        //         count++;
        //     }
        // }
        // return count;

        while(n!=0){
            if((n&1)==1){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
}