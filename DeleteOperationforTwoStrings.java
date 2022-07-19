class Solution {
    public int minDistance(String word1, String word2) {
     int[][] dp = new int[word1.length()+1][word2.length()+1];
     for(int[] d:dp)
        Arrays.fill(d,-1);
     return word1.length()+word2.length()-2*lcs(word1,word2,word1.length(),word2.length(),dp);   
    }
    
    public int lcs(String word1,String word2,int m,int n,int[][] dp) {
        if(dp[m][n]!=-1) return dp[m][n];
         if (m == 0 || n == 0)
            return 0;
        if(word1.charAt(m-1)==word2.charAt(n-1)) 
            dp[m][n] = 1+lcs(word1,word2,m-1,n-1,dp);
        else {
            dp[m][n] = Math.max(lcs(word1,word2,m-1,n,dp),lcs(word1,word2,m,n-1,dp));
        }
        return dp[m][n];
    }
}
