
import java.math.BigInteger;
class Solution {
    public List<Integer> addToArrayForm(int[] numArr, int k) {

        List<Integer> list = new ArrayList<Integer>();
        String num = "";
        for(int digit : numArr) {
            num = num + digit;
        }

        BigInteger num1 = new BigInteger(num);
        BigInteger num2 = new BigInteger(String.valueOf(k));
        num1 = num1.add(num2);

        String num1Str = num1.toString();
        for(char c : num1Str.toCharArray()) {
            list.add(Integer.parseInt(String.valueOf(c)));
        }
        return list;
    }
}
