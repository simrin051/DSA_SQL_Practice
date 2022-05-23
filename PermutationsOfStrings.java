class Solution {
	int count =0;
	public int countSubstrings(String s) {
		char[]  strChar = s.toCharArray();
    
		for(int i=0;i<strChar.length;i++) {
        
        // for odd length
       count += countPalindromeStrings(s,i,i,0,strChar.length-1);
        
        //  for even length
        count += countPalindromeStrings(s,i,i+1,0,strChar.length-1);
    }
    return count;
}

public int countPalindromeStrings(String s,int leftPointer, int rightPointer, int start, int end) {
   int count =0;
    while(leftPointer>= start && rightPointer <= end) {
        if(s.charAt(leftPointer) == s.charAt(rightPointer)) {
            System.out.println(s.charAt(leftPointer));
            leftPointer--;
            rightPointer++;
            ++count;
        }else {return count;}
    }
    return count;
}
}
