package com.main.leetcode;

public class CorrectSolution1 {
	  public static long maxPoints(int[][] grid) {
	        int N = grid.length;
	        int M = grid[0].length;
	        long[] dp = new long[M];
	        for(int i=0; i < M; i++)
	        {
	            dp[i] = grid[0][i];
	            System.out.print(dp[i]+" ");
	        }
	            for(int r=1; r < N; r++)
	        {
	            long[] next = new long[M];
	            long[] suffix = new long[M];
	            suffix[M-1] = dp[M-1];
	         
	            for(int i=M-2; i >= 0; i--)
	            {
	                suffix[i] = Math.max(suffix[i+1]-1, dp[i]);
	                
	              
	            }
	             long prefix = 0L;
	            for(int i=0; i < M; i++)
	            {
	                long temp = suffix[i];
	                temp = Math.max(temp, prefix);
	                next[i] = temp+grid[r][i];
	                prefix = Math.max(prefix, dp[i])-1;
	                prefix = Math.max(prefix, 0);
	             }
	            dp = next;
	        }
	        long res = 0L;
	        for(long x: dp)
	            res = Math.max(res, x);
	        return res;
	    }
	  public static void main(String[] args)
	  {
			int[][] matrix=  {{0,3,0,4,2},{5,4,2,4,1},{5,0,0,5,1},{2,0,1,0,3}};
			long res=maxPoints(matrix);
			//System.out.println(res);
	  }
}
