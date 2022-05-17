/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    
    TreeNode ans;
    
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
      inorder(original,cloned,target);   
      return ans;
    }
    
    public void inorder(TreeNode original,TreeNode cloned, TreeNode target) 
    {
        if(original!=null) {
        inorder(original.left,cloned.left,target);
        if(original==target) {
            ans = cloned;   
        }
        inorder(original.right,cloned.right,target);
        }
    }    
    
}
