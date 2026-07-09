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
    private void levelOrderTraversal(TreeNode node, int level,  List<List<Integer>> result) {
        if(node == null) return;

        if(result.size()<=level) {
            result.add(new ArrayList<>());

        }
        // adding data to result at that level
        result.get(level).add(node.val);
        levelOrderTraversal(node.left,level+1,result);
        levelOrderTraversal(node.right,level+1,result);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        levelOrderTraversal(root,0,result);
        return result;
    }
}