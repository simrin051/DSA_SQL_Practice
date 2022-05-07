class Solution {
    public boolean find132pattern(int[] nums) {  
        int thirdElement = Integer.MIN_VALUE; 
        for(int i=nums.length-1;i>=0;i--) {
            if(nums[i]<thirdElement) return true;
            while(!stack.isEmpty() && stack.peek()<nums[i]) thirdElement=stack.pop();
            stack.push(nums[i]);
        }
        return false;
    }
}
