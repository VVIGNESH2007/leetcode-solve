// Last updated: 8/14/2026, 11:00:07 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
18        List<Integer> res = new ArrayList<>();
19        int i = 0;
20        Stack<TreeNode> s = new Stack<>();
21        s.push(root);
22        while (s.size() > 0) {
23            TreeNode node = s.pop();
24            if (node == null) continue;
25            if (node.val != voyage[i++]) return Arrays.asList(-1);
26            if (node.right != null && node.right.val == voyage[i]) {
27                if (node.left != null) res.add(node.val);
28                s.push(node.left);
29                s.push(node.right);
30            } else {
31                s.push(node.right);
32                s.push(node.left);
33            }
34        }
35        return res;
36    }
37}