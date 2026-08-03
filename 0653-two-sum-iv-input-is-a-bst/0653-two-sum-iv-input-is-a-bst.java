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
    public boolean findTarget(TreeNode root, int k) {
        // first approach use a hash set simple

        Set<Integer> set=new HashSet<>();
        return checkInteger(root,set,k);
    }
    private boolean checkInteger(TreeNode root,Set<Integer> set,int k) {
        if(root==null) return false;
        if(set.contains(k-root.val)) return true;
        set.add(root.val);
        return checkInteger(root.left,set,k)||checkInteger(root.right,set,k);
    }
}