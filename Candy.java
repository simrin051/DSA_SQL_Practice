import java.util.Arrays;
class Solution {
    public int candy(int[] ratings) {
        int[] candies = new int[ratings.length];
        Arrays.fill(candies, 1);
        boolean hasChanged=true;
        
        while(hasChanged) {
            hasChanged=false;
        for(int i=0;i<candies.length;i++) {
            if(i!=ratings.length-1 && ratings[i]>ratings[i+1] && (candies[i]<=candies[i+1])) {
                candies[i] = candies[i+1]+1;
                hasChanged=true;
            }
            if(i>0 && ratings[i-1]<ratings[i] && candies[i-1]>=candies[i]) {
                candies[i] = candies[i-1]+1;
                hasChanged=true;
            }
        }
     }
      return  Arrays.stream(candies).sum();
    }
}
