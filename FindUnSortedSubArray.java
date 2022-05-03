class Solution {
    public int findUnsortedSubarray(int[] nums) {
       int l=nums.length,r=0;
        for(int i=0;i<nums.length;i++) {
           for(int j=i+1;j<nums.length;j++) {
               if(nums[i] > nums[j]) {
                   l = Math.min(l,i);
                   r= Math.max(r,j);
               }
           }
       }
    return r-l<0?0:r-l+1;
    }
}
