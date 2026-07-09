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
    private int findMaxPathSum(TreeNode node, int[] result) {
        if(node == null ) return 0;
        // calculate left sum  and right sum
        int leftSum = findMaxPathSum(node.left,result);
        int rightSum = findMaxPathSum(node.right,result);
        // calculate left and right maxsum if sum is less than 0 then assign max is 0
        int leftMaxSum=Math.max(0,leftSum);
        int rightMaxSum=Math.max(0,rightSum);

        result[0]= Math.max(result[0],leftMaxSum+rightMaxSum+node.val);

        return node.val + Math.max(leftMaxSum,rightMaxSum);

    }
    public int maxPathSum(TreeNode root) {
        int[] result = {root.val};

        // findinng the max path sum and store it in res
        findMaxPathSum(root,result);

        return result[0];
    }
}