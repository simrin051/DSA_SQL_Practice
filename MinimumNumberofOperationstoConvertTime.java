import java.lang.*;
class Solution {
    public int convertTime(String current, String correct) {
        
   int currentTime = Integer.valueOf(current.substring(0,2))*60 + Integer.valueOf(current.substring(3,5));
 
    int correctTime  = Integer.valueOf(correct.substring(0,2))*60 + Integer.valueOf(correct.substring(3,5));
        
       int res =0, diff = correctTime - currentTime ;
        
        for(int time: new int[] {60, 15, 5, 1}) {
            res = res + (diff/time);
            diff = diff%time;
        
        }
        return res;
    }
}
