// Last updated: 7/14/2026, 12:17:04 PM
class Solution {
    public String getPermutation(int n, int k) {
        // Step 1: Precompute factorials up to n-1
        int[] factorials = new int[n];
        factorials[0] = 1;
        for (int i = 1; i < n; i++) {
            factorials[i] = factorials[i - 1] * i;
        }
        
        // Step 2: Create a list of available numbers
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }
        
        // Step 3: Convert k to 0-indexed
        k--;
        
        StringBuilder result = new StringBuilder();
        
        // Step 4: Determine digits step-by-step
        for (int i = n - 1; i >= 0; i--) {
            // Find the index of the number to use
            int index = k / factorials[i];
            
            // Append and remove the number from the pool
            result.append(numbers.remove(index));
            
            // Update k for the next position
            k %= factorials[i];
        }
        
        return result.toString();
    }
}
