Determine Whether Matrix Can Be Obtained By Rotation

class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0;i<4;i++) {
            if(Arrays.deepEquals(mat,target)) return true;
            transpose(mat);
            rotateMatrix(mat);
        }
        return false;
    }
    
       
    public void transpose(int[][] matrix) {
        for(int i=0;i<matrix.length;i++) {
            for(int j=i+1;j<matrix[0].length;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    
    
    public void rotateMatrix(int[][] matrix) {
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix.length/2;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-j-1];
                matrix[i][matrix.length-j-1] = temp;
            }
        }
    }
}
