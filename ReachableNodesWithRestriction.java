class Solution {
    int count=0;
    List<List<Integer>> list = new ArrayList<>();
    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        boolean[] visited = new boolean[n];
        
        
        // First mark resitricted nodes as visited
        for(int node: restricted) {
            visited[node] = true;
        }
        
        // Create the graph
        for(int i=0;i<n;i++) {
            list.add(new ArrayList<>());
        }
        
        // Fill the graph
        for(int[] edge: edges) {
            list.get(edge[0]).add(edge[1]);
            list.get(edge[1]).add(edge[0]);
        }
        
        // call the dfs
        dfs(0,visited);
        return count;
        
    }
    
    public void dfs(int node,boolean[] visited) {
        visited[node] = true;
        count++;
        for(int i: list.get(node)) {
            if(!visited[i]) {
                dfs(i,visited);
            }
        }
    }
}
