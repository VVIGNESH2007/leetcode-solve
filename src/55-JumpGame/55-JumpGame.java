// Last updated: 7/14/2026, 12:17:07 PM
class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        boolean[]dp=new boolean[n];
        dp[0]=true;
        for(int i=0;i<n;i++){
            if(!dp[i]) continue;
            for(int jump=1;jump<=nums[i];jump++){
                int end=jump+i;
                if(end<n){
                    dp[end]=true;
                }
            }
        }
        return dp[n-1];
    }
}