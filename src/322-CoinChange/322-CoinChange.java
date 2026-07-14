// Last updated: 7/14/2026, 12:15:32 PM
class Solution {
    public int coinChange(int[] coins, int amount) {
        // dp[i] = minimum coins needed to make amount i
        int[] dp = new int[amount + 1];
        
        // Fill with a value larger than possible max
        for (int i = 1; i <= amount; i++) {
            dp[i] = amount + 1;
        }
        
        dp[0] = 0;
        
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
