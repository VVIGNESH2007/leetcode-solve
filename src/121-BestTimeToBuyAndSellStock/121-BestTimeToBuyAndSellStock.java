// Last updated: 7/14/2026, 12:16:33 PM
class Solution {
    public int maxProfit(int[] prices) {
        
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int price : prices) {
            
            // Update minimum price seen so far
            if (price < minPrice) {
                minPrice = price;
            }
            
            // Calculate profit if sold today
            else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        
        return maxProfit;
    }
}