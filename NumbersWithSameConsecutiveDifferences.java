class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
 
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        while(--n>0) {
            List<Integer> temp = new ArrayList<Integer>();
            
            for(int val: list) {
                int rem = val%10;
                if(rem+k<10) 
                    temp.add(val*10+rem+k);
                if(k!=0 && rem-k>=0)
                    temp.add(val*10+rem-k);
            }
            
            list = temp;
            
        }
        
        return list.stream().mapToInt(num->num).toArray();
    }
}
