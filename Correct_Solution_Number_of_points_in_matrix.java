package com.main.leetcode;

public class Correct_Solution_Number_of_points_in_matrix {
	  static int n, m;
	   static long[][] dp, v1, v2;

	    public static long maxPoints(int[][] points) {
	        n = points.length;
	        m = points[0].length;
	        dp = new long[n][m];
	        v1 = new long[n][m];
	        v2 = new long[n][m];
	       
	        for (int i = 0; i < m; i++) {
	            dp[0][i] = points[0][i];
	            
	        } 
	        update(0);

	        for (int i = 1; i < n; i++) {
	            for (int j = 0; j < m; j++) {
	                dp[i][j] = points[i][j] + Math.max(v1[i - 1][j] - j, v2[i - 1][j] - (m - 1 - j));
	            }
	            update(i);
	        }

	        long ans = Long.MIN_VALUE;
	        for (int j = 0; j < m; j++) {
	            ans = Math.max(ans, dp[n - 1][j]);
	        } 
	        return 0;
	    }

	    private static void update(int i) {
	        v1[i][0] = dp[i][0];
	        for (int j = 1; j < m; j++) {
	            v1[i][j] = Math.max(dp[i][j] + j, v1[i][j - 1]);
	        }
	        v2[i][m - 1] = dp[i][m - 1];
	        for (int j = m - 2; j >= 0; j--) {
	            v2[i][j] = Math.max(dp[i][j] + m - 1 - j, v2[i][j + 1]);
	        }
	    }
	    public static void main(String[] args)
		  {
	    	int[][] matrix= {{1,5},{2,3},{4,2}};
				long res= maxPoints(matrix);
				System.out.println(res);
		  }
}
