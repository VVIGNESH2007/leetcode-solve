// Last updated: 7/14/2026, 12:17:18 PM
class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int[]dp=new int[n];
        dp[n-1]=0;
        for(int i=n-2;i>=0;i--){
            int min=Integer.MAX_VALUE;
            for(int j=1;j<=nums[i]&&i+j<n;j++){
                if(dp[i+j]<min){
                    min=dp[i+j];
                }
            }
            if(min!=Integer.MAX_VALUE){
                dp[i]=min+1;
            }else {
                // CORRECTION: Explicitly mark this index as unreachable
                dp[i] = Integer.MAX_VALUE; 
            }
        }
        return dp[0];
    }
}