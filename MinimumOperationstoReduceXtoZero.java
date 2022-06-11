class Solution {
    public int minOperations(int[] nums, int x) {
        int sum=0,l=0,currSum=0,res=-1;
        for(int i=0;i<nums.length;i++)           
            sum=sum+nums[i];
        
        for(int r=0;r<nums.length;r++) {
            currSum=currSum+nums[r];
            while(l<=r && currSum>sum-x)currSum=currSum-nums[l++];
            if(currSum==sum-x) {
                res=Math.max(res,r-l+1);
            }
        }
        return res==-1?-1:nums.length-res;
    }
}
