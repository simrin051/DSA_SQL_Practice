class Solution {
    public int minimumEffortPath(int[][] heights) {
        int l=0,r=1000001;
        
        while(l<r) {
            int limit = (l+r)/2;
            if(isGood(heights,limit)) {
                r=limit;
            } else {
                l=limit+1;
            }
        }
    return l;    
    }
    
    public boolean isGood(int[][] heights, int limit) {
        int R = heights.length;
        int C = heights[0].length;
        boolean[][] visited=new boolean[heights.length][heights[0].length];
        Queue<int[]> q= new LinkedList();
        q.add(new int[]{0,0});
        
        int[][] dir ={{1,0},{0,1},{-1,0},{0,-1}};
        
        while(q.size()>0) {
           
            int x = q.peek()[0];
            int y= q.peek()[1];
            
            q.poll();
            
            if(x==R-1 && y==C-1)return true;
            
            for(int[] d:dir) {
                int nx = d[0]+x;
                int ny = d[1]+y;
                
                if( (nx>=0 && nx<R && ny>=0 && ny<C) && !visited[nx][ny])                 {
                    if(Math.abs(heights[x][y]-heights[nx][ny])<=limit) {
                        q.add(new int[]{nx,ny});
                        visited[nx][ny] = true;
                    }
                }
            }
        }
        return false;
    }
    
}
