import java.util.Arrays;

class Solution {
    public int minimumAddedCoins(int[] coins, int target) {
        int index = 0, additions = 0, currentMax = 0;
        Arrays.sort(coins);
        while(currentMax < target) {
            if(index < coins.length && coins[index] <= currentMax+1) {
                currentMax = currentMax + coins[index];
                index = index + 1;
            } else {
                currentMax += currentMax + 1;
                ++additions;
            }
        }    
        return additions;
    }
}
