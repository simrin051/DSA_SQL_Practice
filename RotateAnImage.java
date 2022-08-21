https://leetcode.com/problems/rotate-image/

class Solution {
public void rotate(int[][] matrix) {
    // transpose
    transpose(matrix);
    // rotate
    rotateMatrix(matrix);
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
