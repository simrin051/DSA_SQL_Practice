class Solution {
    private int depth = 0;
    
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        int[] disc = new int[n];
        Arrays.fill(disc, -1);
        int[] low = new int[n];
        
        // Create the graph
        List<Integer>[] graph=new ArrayList[n];
        for(int i=0;i<n;i++) {
            graph[i]=new ArrayList<Integer>();
        }
        
        for(List<Integer> connection: connections) {
            int from = connection.get(0);
            int to = connection.get(1);
            graph[from].add(to);
            graph[to].add(from);
        }
        
        // Create the result
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<n;i++) {
            if(disc[i]==-1){
                dfs(i, disc, low, graph, result, i);
            }
        }
        return result;
    }
    
    public void dfs(int u, int[] disc,int[] low,  List<Integer>[] graph,  List<List<Integer>> result , int parent) {
        ++depth;
        low[u] = disc[u]=depth;
        List<Integer> children = graph[u];
        for(int v: children) {
             if (v == parent) {
                continue;  // For same node
            } else {
            if(disc[v]==-1) {
                dfs(v, disc, low, graph,result,u);
                low[u]=Math.min(low[u],low[v]);
                 if (low[v] > disc[u]) {
                        result.add(Arrays.asList(u, v));
                    }
            }else {
                low[u]=Math.min(low[u],low[v]);
            }
             }
        }
    } 
}
