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

    private void findPathSum(TreeNode node, int targetSum, List<List<Integer>> result, List<Integer> current) {
        if(node == null) return;
        current.add(node.val);
        if(node.left == null && node.right == null && targetSum-node.val == 0) {
            result.add(new ArrayList(current));
        }
         findPathSum(node.left,targetSum-node.val,result,current);
         findPathSum(node.right,targetSum-node.val,result,current);

        // this remove is to remove the last element from current to go to the right node of that node
         current.remove(current.size()-1);

    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        findPathSum(root,targetSum,result,new ArrayList());
        return result;
    }
}