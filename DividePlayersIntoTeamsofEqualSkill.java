import java.util.Arrays;
class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        long totalSum=0;
        int i=0,j=skill.length-1,equalSum = skill[0] + skill[skill.length-1];
        while(i<j) {
            if(skill[i]+skill[j]!=equalSum) {
                return -1;
            }
            totalSum = totalSum + (skill[i]*skill[j]);
            i++;
            j--;
        }
        return totalSum;
    }
}
