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
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;

        return symmetric(root.left,root.right); 
    }

    public boolean symmetric(TreeNode first,TreeNode second){
        if(first==null || second==null){
            return first==second;
        }

        if(first.val!=second.val){
            return false;
        }

        return symmetric(first.left ,second.right) && symmetric(first.right,second.left);
    }
}
