// Last updated: 7/14/2026, 12:16:48 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void inort(TreeNode root,List<Integer> res){
        if(root==null){
            return;
        }
        inort(root.left,res);
        res.add(root.val);
        inort(root.right,res);

    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        inort(root,res);
        return res;
    }
}