class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        return Math.abs(height(root.left)-height(root.right))<=1 && isBalanced(root.left) && isBalanced(root.right);
    }
    
    public int height(TreeNode node) {
        if(node==null) return 0;
        else return Math.max(height(node.left),height(node.right))+1;
    }
}
