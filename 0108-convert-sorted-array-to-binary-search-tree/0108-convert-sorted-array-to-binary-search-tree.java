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
    public TreeNode sortedArrayToBST(int[] nums) {
        return bst(nums,0,nums.length-1);
    }
    private TreeNode bst(int[] nums,int left,int right) {
        // base case 
        if(left>right) return null;
        // mmidddle element become root
        int mid=left+(right-left)/2;
        TreeNode root=new TreeNode(nums[mid]);
        // recursively call building the left and right subtreee
        root.left=bst(nums,left,mid-1);
        root.right=bst(nums,mid+1,right);


        return root;
    }
}