class Solution {    
        int  sum =0;
		int maxHeight = Integer.MIN_VALUE;
		int height = 0;
	    public int deepestLeavesSum(TreeNode root ) {	
	      traverseRoot(root,0);   
	      return sum;
	    }
	    public void traverseRoot(TreeNode root, int height) {
	    	if(root==null) return;
	    	height = height+1;
	    	 traverseRoot(root.left,height);
	    	if(root.left==null && root.right==null) {
	    		if(height > maxHeight) {
	    			sum = root.val;
	    			maxHeight= height;
	    		} 	
	    		else if(height == maxHeight) {
	    			sum =sum+root.val;
	    		}
	         }
	       traverseRoot(root.right,height);
	    }   
}

Points to remember - 
1. Pass height when calling traverseRoot so that height is tracked in the call stack.
2. We don't have to make the methods and variables as static. If we use static keyword for  variables then same variable will get modified in each recursive call. There are 2 recursive call, same variable value would be modified.
