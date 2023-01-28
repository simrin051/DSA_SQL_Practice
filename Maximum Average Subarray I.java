class Solution {
   public double findMaxAverage(int[] arr, int k) {
       int currSum =0 ,j=0;
       double avg=0,maxAvg = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            currSum = currSum + arr[i];
            if(i>=(k-1)) {
                avg = ( double ) currSum/k;    
                maxAvg = Math.max(avg,maxAvg);
                currSum = currSum - arr[j];
                j++;
            }
        }
        return maxAvg;
    }
}
