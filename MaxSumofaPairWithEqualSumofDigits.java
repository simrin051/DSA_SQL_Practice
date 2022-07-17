class Solution {
    int max=-1;
    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    public int maximumSum(int[] nums) {
        
        for(int i=0;i<nums.length;i++) {
            int sum = sumOfNum(nums[i]);
            if(map.containsKey(sum)) {
                 max = Math.max(max,map.get(sum)+nums[i]);
                 map.put(sum,Math.max(map.get(sum),nums[i]));
            } else {
                map.put(sum,nums[i]);
            }
        }
        return max;
    }
    
    public int sumOfNum(int number) {
        int sum=0,digit=0;
        while(number > 0)  
    {  
        digit = number % 10;    
        sum = sum + digit;    
        number = number / 10;  
    }  
        return sum;
    }
}
