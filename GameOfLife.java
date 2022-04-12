class Solution {
    public void gameOfLife(int[][] board) {
        int[][] temp = new int[board.length][board[0].length];
        
        int rows = temp.length,cols = temp[0].length;
        
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                
                int r = i;
                int c = j;
                
                     int totalLiveNeighbors =  checkLiveNeighbour(board,r-1,c-1) +
                checkLiveNeighbour(board,r+1,c-1) +
                checkLiveNeighbour(board,r-1,c+1) +
                checkLiveNeighbour(board,r+1,c+1) +
                checkLiveNeighbour(board,r,c-1) +
                checkLiveNeighbour(board,r,c+1) +
                checkLiveNeighbour(board,r-1,c) +
                checkLiveNeighbour(board,r+1,c);  
                
                if(board[i][j]==1) {
                  temp[i][j] = ((totalLiveNeighbors < 2) || (totalLiveNeighbors > 3)) ?0:1; 
                } else {
                  temp[i][j] = (totalLiveNeighbors == 3) ? 1:0;  
                }
            }
        }
        
    for(int i=0;i<rows;i++) {
        board[i] = temp[i].clone(); // Important! How to use clone
    }
                                 
    }                             
 
                                 
                                 
   public int checkLiveNeighbour(int[][] board,int r,int c) {
    if(r < 0 || r>=board.length || c < 0 || c>=board[0].length || board[r][c] == 0) {
      return 0;  
    } else {
        return 1;
    }  
}
}
