class Solution {
    public int countOdds(int low, int high) {
       int ans = (high-low)/2;
       if(low%2!=0 || high%2!=0) return ans+1;
       return ans;
    }
}
