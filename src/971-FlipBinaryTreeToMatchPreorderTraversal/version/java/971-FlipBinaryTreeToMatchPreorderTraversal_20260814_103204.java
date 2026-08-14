// Last updated: 8/14/2026, 10:32:04 AM
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
17    private List<Integer> flip;
18    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
19        flip=new ArrayList<>();
20        int[]nums=new int[1];
21        if(!dfs(root,voyage,nums)){
22            return Arrays.asList(-1);
23        }
24        return flip;
25    }
26    public boolean dfs(TreeNode root,int[]arr,int[] index){
27        if(root==null){
28            return true;
29        }
30        if(root.val!=arr[index[0]]){
31            return false;
32        }
33        index[0]++;
34        if(root.left!=null&&root.left.val!=arr[index[0]]){
35            if(root.right!=null&&root.right.val==arr[index[0]]){
36                flip.add(root.val);
37                return dfs(root.right,arr,index)&&dfs(root.left,arr,index);
38            }
39            return false;
40        }
41        return dfs(root.left,arr,index)&&dfs(root.right,arr,index);
42    }
43}