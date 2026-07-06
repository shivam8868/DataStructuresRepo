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
        if(node == null) {
            return 0;
        }
        int leftHeight=height(node.left);
        int rightHieght=height(node.right);
        return Math.max(leftHeight,rightHieght)+1;
            }
    public int maxDepth(TreeNode root) {
        int height=height(root);
        return height;
    }
}