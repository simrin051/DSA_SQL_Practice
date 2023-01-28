class Solution {
    public int divisorSubstrings(int num, int k) {

        int kBeauty=0;
        var pow = (int) Math.pow(10,k);
        for(var dup=num;dup!=0;dup=dup/10) {

            var sub = dup%pow;
            if(sub!=0 && num%sub==0) ++kBeauty;
            if(dup/pow == 0) break;

        }
        return kBeauty;
     }
}

// Solution using String , will be trivial and expensive
