Graph Colouring

Consider 0 has not colored, 1 as blue and -1 as red.

DFS Approach:

Step 1: Color the first node with blue ( 0 ) .
Step 2: Color the neighbouring nodes with red ( 1 ). Neighbouring nodes can be found by iterating graph[i]. i is the row index of graph
Step 3: If the neighbouring node is already colored and if situation comes that we need to color again then conflict arises. If conflict arises it means it is not bipartite graph

class Solution {
public boolean isBipartite(int[][] graph) {
   	int[] color=new int[graph.length];
	for(int i=0;i<graph.length;i++) {
		if(color[i]==0 && !validColor(graph,color,1,i)) return false;
	}
	return true;
 
}

	public static boolean validColor(int[][] g , int[] color, int c, int node) 
{
	if(color[node]!=0) 
	  return color[node]==c; 
	color[node] = c; 
	
	for(int n: g[node]) {
		if(!validColor(g,color,-c,n))return false; // Here a not operation is used to check whether node n is already colored.
	}
	return true;
}
}

BFS Approach:

Step1 : Color all the nodes adjacent to node 0 in the start itself.
Step 2: Color all the nodes added to the queue.
Step 3: Poll a node from the queue to fetch list of adjacent nodes.
Step 4: If the node is already coloured by same color has the parent node then it is not a bipartite graph

class Solution {
public boolean isBipartite(int[][] graph) {
   	int[] color=new int[graph.length];
	for(int i=0;i<graph.length;i++) {
		
		if(color[i]==0) {
			Queue<Integer> q = new LinkedList<Integer>();
			q.add(i);
			color[i]= 1;
			while(!q.isEmpty()) {
				Integer node = q.poll();
				for(int n: graph[node]) {
					if(color[n]==color[node])return 	false;
					else  if(color[n] == 0) {
						q.add(n);
						color[n] = -color[node];
					}
				}
			}
		}

	}
	return true;
}
}
