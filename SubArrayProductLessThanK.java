class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

       int product=1,left=0,count=0;
       if(k<=1) return 0;

        for(int i=0;i<nums.length;i++) {
            
            product = product * nums[i];    
            while(product>=k) {
                product = product/nums[left++];
            }

            count += i-left+1;

        }
        return count;
    }
}
