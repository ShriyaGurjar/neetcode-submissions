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

    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true ;
        }
         int heightL=height(root.left);
         int heightR=height(root.right);

         if (Math.abs(heightL - heightR) > 1) {
        return false;
    }

    return isBalanced(root.left) && isBalanced(root.right);
    }
    public int height(TreeNode root) {
        if(root==null){
           return 0;
        }
        int  RightH= height(root.right);
          int LeftH= height( root.left);

        return 1+ Math.max(LeftH,RightH);
    }}
