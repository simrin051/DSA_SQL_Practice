class Solution {
    public boolean isValidSudoku(char[][] board) {
         HashSet<String> set = new HashSet<>();
        for(int row = 0; row < board.length; row++) {
            for(int col = 0; col < board.length; col++) {
                char currentValue = board[row][col];
                if (currentValue != '.') {
                    if (!set.add(currentValue + " found in row " + row) ||
                        !set.add(currentValue + " found in col " + col) ||
                        !set.add(currentValue + " found in 3*3 box " + row/3 + " - " + col/3))
                        return false;
                }
            }   
        }
        return true;

    }
}
