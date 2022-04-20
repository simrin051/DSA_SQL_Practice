class BSTIterator {

    Stack<TreeNode> stack;
    public BSTIterator(TreeNode root) {
        stack = new Stack<TreeNode>();
        pushAllToLeft(root);
        
    }
    
    public int next() {
        TreeNode node = stack.pop();
        if(node.right!=null) {
            pushAllToLeft(node.right);
        }
        return node.val;
    }
    
    public boolean hasNext() {
        return stack.size()!=0;
    }
    
    public void pushAllToLeft(TreeNode root) {
        
        while(root!=null) {
            stack.push(root);
            root = root.left;
            
        }
    }
}
