// Last updated: 8/5/2026, 10:14:22 AM
1class Solution {
2    // Standard Trie Node with two branches: 0 and 1
3    class TrieNode {
4        TrieNode[] children = new TrieNode[2];
5    }
6    
7    public int findMaximumXOR(int[] nums) {
8        TrieNode root = new TrieNode();
9        
10        // Step 1: Insert all numbers into the Trie
11        for (int num : nums) {
12            TrieNode current = root;
13            for (int i = 31; i >= 0; i--) {
14                int bit = (num >> i) & 1; // Extract the i-th bit
15                if (current.children[bit] == null) {
16                    current.children[bit] = new TrieNode();
17                }
18                current = current.children[bit];
19            }
20        }
21        
22        int globalMaxXOR = 0;
23        
24        // Step 2: For each number, find its maximum possible XOR value
25        for (int num : nums) {
26            TrieNode current = root;
27            int currentMaxXOR = 0;
28            
29            for (int i = 31; i >= 0; i--) {
30                int bit = (num >> i) & 1;
31                int oppositeBit = 1 - bit; // 0 becomes 1, 1 becomes 0
32                
33                // If the ideal path exists, take it!
34                if (current.children[oppositeBit] != null) {
35                    currentMaxXOR |= (1 << i); // Set the i-th bit of the result to 1
36                    current = current.children[oppositeBit];
37                } else {
38                    // Forced to take the path that gives a XOR of 0
39                    current = current.children[bit];
40                }
41            }
42            // Update the largest XOR found across the whole array
43            globalMaxXOR = Math.max(globalMaxXOR, currentMaxXOR);
44        }
45        
46        return globalMaxXOR;
47    }
48}
49