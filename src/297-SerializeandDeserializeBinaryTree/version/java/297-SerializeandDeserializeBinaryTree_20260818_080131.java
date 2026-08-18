// Last updated: 8/18/2026, 8:01:31 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10public class Codec {
11
12    // Encodes a tree to a single string.
13    public String serialize(TreeNode root) {
14
15        if (root == null) {
16            return "#";
17        }
18
19        return root.val + "," +
20               serialize(root.left) + "," +
21               serialize(root.right);
22    }
23
24    // Decodes your encoded data to tree.
25    public TreeNode deserialize(String data) {
26
27        Queue<String> queue = new LinkedList<>(
28            Arrays.asList(data.split(","))
29        );
30
31        return buildTree(queue);
32    }
33
34    private TreeNode buildTree(Queue<String> queue) {
35
36        String value = queue.poll();
37
38        if (value.equals("#")) {
39            return null;
40        }
41
42        TreeNode root = new TreeNode(Integer.parseInt(value));
43
44        root.left = buildTree(queue);
45        root.right = buildTree(queue);
46
47        return root;
48    }
49}
50
51// Your Codec object will be instantiated and called as such:
52// Codec ser = new Codec();
53// Codec deser = new Codec();
54// TreeNode ans = deser.deserialize(ser.serialize(root));