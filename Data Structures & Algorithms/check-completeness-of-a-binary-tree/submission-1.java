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
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        boolean nullSeen=false;
        while(!q.isEmpty()){
            int size=q.size();
           
           for(int i=0;i<size;i++){
             TreeNode curr=q.poll();
             if(curr==null){
              nullSeen=true;
              continue;
             }
             if (nullSeen){
              return false;
             }
           if(curr.left==null && curr.right!=null){
            return false;
           }
            
                q.add(curr.left);
      
               q.add(curr.right);
           
           }
            
        }
         return true;
           }
          
    
}