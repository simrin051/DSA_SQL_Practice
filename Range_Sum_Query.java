For 1 Dimensional - https://leetcode.com/problems/range-sum-query-immutable/

class NumArray {

    int[] dp;
    public NumArray(int[] nums) {
       dp = new int[nums.length+1];
       dp[0]=0;
        for(int i=0;i<nums.length;i++) {
           dp[i+1]=dp[i]+nums[i];
       } 
    }
    
    public int sumRange(int left, int right) {
        return  dp[right+1]-dp[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */


For 2 Dimensional - https://leetcode.com/problems/range-sum-query-2d-immutable/

class NumMatrix {
    
    int[][] dp;

    public NumMatrix(int[][] matrix) {
        dp=new int[matrix.length+1][matrix[0].length+1];
        dp[0][0]=0;
        for(int i=0;i<matrix.length;i++) {
           for(int j=0;j<matrix[0].length;j++) {
                dp[i+1][j]=dp[i][j]+nums[i][j];
           }
       } 
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum =0;
        for(int r=row1;r<=row2;r++) {
            sum = sum + dp[][];
        }
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
