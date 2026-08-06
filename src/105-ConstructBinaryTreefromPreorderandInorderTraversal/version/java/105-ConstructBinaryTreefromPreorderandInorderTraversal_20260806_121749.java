// Last updated: 8/6/2026, 12:17:49 PM
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
17    private int index=0;
18    public TreeNode cons(Map<Integer,Integer> mp,int[]preorder,int left,int right){
19        if(left>right){
20            return null;
21        }
22        int rootval=preorder[index++];
23        TreeNode root=new TreeNode(rootval);
24        int rootindex=mp.get(rootval);
25        root.left=cons(mp,preorder,left,rootindex-1);
26        root.right=cons(mp,preorder,rootindex+1,right);
27        return root;
28    }
29    public TreeNode buildTree(int[] preorder, int[] inorder) {
30        Map<Integer,Integer> mp=new HashMap<>();
31        for(int i=0;i<inorder.length;i++){
32            mp.put(inorder[i],i);
33        }
34        return cons(mp,preorder,0,inorder.length-1);
35    }
36}