// Last updated: 7/14/2026, 12:16:18 PM
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
    public void prot(TreeNode root,List<Integer> res){
        if(root==null){
            return ;
        }
        res.add(root.val);
        prot(root.left,res);
        prot(root.right,res);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        prot(root,res);
        return res;
    }
}