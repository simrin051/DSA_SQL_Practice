class Solution {
    
    int[][] dirs ={{1,0},{0,1},{-1,0},{0,-1}};
    int[][] helper;
    int path=0;    
    public int longestIncreasingPath(int[][] matrix) {
        this.helper = new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
              path=Math.max(path,dfs(i,j,matrix));
            }
        }
        return path;
    }
    
    private int dfs(int x, int y, int[][] matrix) {
        if(helper[x][y]!=0) return helper[x][y];
        for(int d=0;d<dirs.length;d++) {
            int i = x + dirs[d][0];
            int j = y + dirs[d][1];
        
        if(i>=0 && j>=0 && i<matrix.length && j<matrix[0].length && matrix[x][y] < matrix[i][j] ) {
        helper[x][y] = Math.max(helper[x][y],dfs(i,j,matrix));
        }
        }
         return ++helper[x][y];
        }
       
    
}
