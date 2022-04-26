class Solution {
    public int minCostConnectPoints(int[][] points) {
            int noOfEdges = 0, minCost =0;
           PriorityQueue<Pair<Integer,Integer>> heap = new   PriorityQueue<Pair<Integer,Integer>>((a,b)->a.getKey()-b.getKey());
        
        int n = points.length;
        boolean[] inMST = new boolean[n];
        
        heap.add(new Pair(0,0));
        
        while(noOfEdges < n) {
            Pair<Integer,Integer> topElement = heap.poll();
            int nodeWeight = topElement.getKey();
            int currNode =  topElement.getValue();
            
            if(inMST[currNode]) {
                continue;
            }
            
            inMST[currNode] = true;
            noOfEdges++;
            minCost = minCost + nodeWeight;
            
            for(int nextnode=0;nextnode<n;nextnode++) {
                if(!inMST[nextnode]) {
                    int nextWeight = Math.abs(points[currNode][0]-points[nextnode][0]) + Math.abs(points[currNode][1]-points[nextnode][1]);
                    heap.add(new Pair(nextWeight,nextnode));
                }
            }
        }
        
        return minCost;
     }
}
