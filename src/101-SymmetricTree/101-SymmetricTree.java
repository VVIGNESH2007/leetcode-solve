// Last updated: 7/14/2026, 12:16:43 PM
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
    public static boolean find(TreeNode r1,TreeNode r2){
        if(r1==null && r2==null){
            return true;
        }
        if(r1!=null && r2==null || r1==null && r2!=null  ) return false;
        return (r1.val==r2.val) && find(r1.left,r2.right) && find(r1.right,r2.left);
    }
    public boolean isSymmetric(TreeNode root) {
        // code here
        if(root==null){
            return true;
        }
        return find(root.left,root.right);
      
        
    }
}