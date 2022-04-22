 public int[] plusOne(int[] arr) {
         int[] result;
        int lastDigit = arr[arr.length-1];
        Stack<Integer> stack = new Stack<Integer>();
        
        if(lastDigit<9) {
            arr[arr.length-1] = arr[arr.length-1] +1;
            return arr;
        }
        else {
            int carry =1, sum =0, rem=0;
            for(int i=arr.length-1;i>=0;i--) {
                sum = arr[i]+carry;
                rem = sum%10;
                stack.push(rem);
                carry = sum/10;
            }
            
            if(carry==1)
                stack.push(carry);
            
            result = new int[stack.size()];
            
            for(int i=0;i<result.length;i++)
                result[i] = stack.pop();
        }
        
        return result;
    }
