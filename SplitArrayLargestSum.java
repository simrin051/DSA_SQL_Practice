class Solution {
    public int splitArray(int[] nums, int m) {
 
        // 1. Check whether for a given sum you can split the array into m.
       // Here if we split nums into nums.length number of splits. The largest number among all the splits would be the largest number in an array. 
        /**
        Example: [1,2,3,4] => 1|2|3|4  4 is the largest sum with no of splits = array length
       Sum of all the elements in the array is the largest sum with no split. In this case sum is 10
            
            We need to perform search from 4-10 to check whether there is possiblity sum being able to split to m subsets.
            
            Linear Search would give Time Limit Exceeded error if it is large array hence we can use Binary Search. **/
                
          
        int low = Arrays.stream(nums).max().getAsInt();
        int high = Arrays.stream(nums).sum();
        
        while(low < high) {
            int mid = ( low+high )/2;
            if(isPossible(nums,mid,m)) {
                high = mid;
            } else {
                low = mid +1;
            }
        }
        return low;
    }
    
    public boolean isPossible(int[] nums, int sum, int m) {
        
        int splits = 0, currSum =0;
        for(int i=0;i<nums.length;i++) {
        
            currSum = currSum + nums[i];
            
            if(currSum > sum ) {
                ++splits;
                currSum = nums[i];
                if(splits>m-1) { // If the number of splits is greater than m
                    return false;
                }
            }
        }
        return true;
    }
}
