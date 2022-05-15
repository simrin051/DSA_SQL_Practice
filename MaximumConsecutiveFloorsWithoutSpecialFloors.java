class Solution {
    public int maxConsecutive(int bottom, int top, int[] special) {
        int max=Integer.MIN_VALUE;
        Arrays.sort(special);
        
        // from bottom to the first special floor
        max = Math.max(max, special[0]-bottom);
        
        // between special floors
        for(int i=1;i<special.length;i++)
        max = Math.max(max, special[i]-special[i-1]-1);
        
        // from special floor to top 
        max = Math.max(max, top-special[special.length-1]);
        
        return max;
    }
}
