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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        bt(root , targetSum , res, new ArrayList<>());
        return res;
    }
    public void bt(TreeNode Node , int targetSum , List<List<Integer>> res , List<Integer> curr){
        if(Node == null){
            return;
        }
        curr.add(Node.val);
        if(Node.left == null && Node.right == null && targetSum == Node.val ){
            res.add(new ArrayList<>(curr));
        }
        bt(Node.left , targetSum - Node.val , res , curr);
        bt(Node.right, targetSum - Node.val , res , curr);
        curr.remove(curr.size() - 1);
    }
}