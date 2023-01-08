import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public long maxKelements(int[] nums, int k) {
        long totalSum = 0;
        Arrays.sort(nums);
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++) 
            queue.add(nums[i]);
         while(queue.size()>0 && k>0)
        {
            totalSum = totalSum + queue.peek();
            int newNum = (int)Math.ceil((double)queue.peek()/3);
            queue.poll();
            queue.add(newNum);
            k--;
        }   
        return totalSum;
    }
}
