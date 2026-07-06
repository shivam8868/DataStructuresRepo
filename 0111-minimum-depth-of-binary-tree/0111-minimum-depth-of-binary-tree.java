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
    private int height(TreeNode node) {
        if(node==null) return 0;
        if(node.left==null && node.right==null) return 1;

        int left=Integer.MAX_VALUE;
        int right=Integer.MAX_VALUE;
        if(node.left!=null) {
            left=height(node.left);

        }
        if(node.right!=null) {
            right=height(node.right);
        }
        return Math.min(left,right)+1;
    }
    public int minDepth(TreeNode root) {
        int height=height(root);
        return height;
    }
}