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
    public int goodNodes(TreeNode root) {
        
        
        return dfs(root,root.val);
        
         
    }
    int count=0;
    public int dfs(TreeNode root,int maxLength){
        if(root==null){
            return 0;
        }
        if(root.val>=maxLength){
            count++;
           if(root.val>maxLength){
              maxLength=root.val;
           }
        }
        dfs(root.right,maxLength);
        dfs(root.left,maxLength);
        
        return count;
    }
}
