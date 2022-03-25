import java.util.Arrays;
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

    int minDiff = Integer.MAX_VALUE;
    int result = 0;
    for (int i = 0; i < nums.length - 2; i++) {
        int left = i + 1, right = nums.length - 1;
        
        while (left < right) {
            int curSum = nums[i] + nums[left] + nums[right];

			 // If current sum has a smaller difference to the target, set minDiff to a new value and set result as the current sum
            if (Math.abs(target-curSum) < minDiff) {
                result = curSum;
                minDiff = Math.abs(target-curSum);
            }
            
            if (curSum == target) {
                return curSum;
            } else if (curSum > target) {
                right--;
            } else {
                left++;
            }
        }} 
    
    
    return result;
}

    
}
