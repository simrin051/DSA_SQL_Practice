/** Explaination

Example - Input - abca
abc and bca ( check Palindrome checks for abc and bca ). In abc and bca we are omitting one character.

**/

class Solution {
public boolean validPalindrome(String s) {
   int i=0,j=s.length()-1;
    while(i<j) {
        if(s.charAt(i)!=s.charAt(j)) {
           return isPalindrome(s,i,j-1) || isPalindrome(s,i+1,j);     
        }
        i++;
        j--;
    }
    return true;
}

public boolean isPalindrome(String s,int i, int j) {
    while(i<j) {
        if(s.charAt(i)!=s.charAt(j)) {
            return false;
        }
        i++;
        j--;
    }
    return true;
 }
}
