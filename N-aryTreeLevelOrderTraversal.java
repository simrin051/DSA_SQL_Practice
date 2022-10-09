/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {

        List<List<Integer>> output = new ArrayList<List<Integer>>();
         if(root == null) return output;
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);

       while(!queue.isEmpty())
        {
               int rowSize = queue.size();
               
               List<Integer> currRow = new ArrayList<Integer>();

               for(int i=0;i<rowSize;i++) {

                   Node node = queue.poll();
                   currRow.add(node.val);

                    for(int c=0;c<node.children.size();c++) {
                        if(node.children.get(c)!=null)queue.add(node.children.get(c));
                    }
               } 
               output.add(currRow);
        }
            return output;
    }
}
