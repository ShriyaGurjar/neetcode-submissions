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
   int maxSum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
      
      maxPath(root);
      return maxSum;
    } 

    public int maxPath(TreeNode root){
        if(root==null){
            return 0;
        }
        
        int right=Math.max(0,maxPath(root.right));
        int left=Math.max(0,maxPath(root.left));

        int currPath=right+left+root.val;

        maxSum=Math.max(maxSum,currPath);

        return root.val+Math.max(left,right);
    }
    
    
}
