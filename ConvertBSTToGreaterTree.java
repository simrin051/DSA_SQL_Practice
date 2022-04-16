class Solution {
/** Recursive soluion **/
/* The problem is to change the original key plus the sum of all keys greater than the original key in BST.So we need to traverse from right->root->left */
 int sum =0;
public TreeNode convertBST(TreeNode root) {
    if(root == null)
        return null;
    convertBST(root.right); // root.right
    sum = sum + root.val;   // root
    root.val = sum;
    convertBST(root.left); // root.left
    return root;
}
}

/** Iterative Solution **/

public TreeNode convertBST(TreeNode root) {
Stack<TreeNode> stack = new Stack<TreeNode>();
    int sum =0;
    TreeNode node = root;
    while(!stack.isEmpty() || node!=null) {
    while(node!=null) {
        stack.push(node);
        node = node.right; // Traversing to the right most node. This statement is equivalent to convertBST(root.right).
    }
    
    node = stack.pop();  //  Using LIFO approach the last node is removed.
    sum = sum+ node.val;
    node.val = sum ;
    node = node.left; // Traversing to left 
}
  return root;
}
