// Last updated: 7/14/2026, 12:15:04 PM
class Solution {
    public int findLongestChain(int[][] pairs) {
        // Step 1: Sort pairs by their right endpoint
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[1], b[1]));
        
        int currentEnd = Integer.MIN_VALUE;
        int chainLength = 0;
        
        // Step 2: Greedily build the chain
        for (int[] pair : pairs) {
            if (pair[0] > currentEnd) {
                chainLength++;
                currentEnd = pair[1];
            }
        }
        
        return chainLength;
    }
}