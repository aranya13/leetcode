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
    int sum = 0;
    public int sumNumbers(TreeNode root) {
        getPathSum(root , 0);
        return sum;
    }
    public void getPathSum(TreeNode node , int currNum){
        if(node == null){
            return;
        }
        currNum = currNum*10 + node.val;
        if(node.left == null && node.right == null){
            sum += currNum;
            return;
        }
        getPathSum(node.left , currNum);
        getPathSum(node.right, currNum);
    }
}