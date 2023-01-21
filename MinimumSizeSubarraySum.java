class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start=0,sum=0,min=Integer.MAX_VALUE;
        for(int end=0;end<nums.length;end++) {
            sum = sum +nums[end];
            while(sum >= target) {
                sum = sum - nums[start];
                min = Math.min(min,end-start+1);
                start++;
            }
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}
