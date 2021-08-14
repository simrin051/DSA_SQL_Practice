package com.main.leetcode;

public class LongestCommonSubSequenceUsingRecursion {

	public static void main(String[] args)
	{
		  String s1 = "AGGTAB";
		  String s2 = "GXTXAYB";
		  int i=0,j=0,m=s1.length(),n=s2.length();
		  char[] charArr1=s1.toCharArray();
		  char[] charArr2=s2.toCharArray();
		  int x=LCS(charArr1,charArr2,m,n);
		  System.out.println("x value "+x);
	}
	
	public static int LCS(char[] charArr1, char[] charArr2,int m, int n)
	{
		if(m==0 || n==0)
			return 0;
		if(charArr1[m-1]==charArr2[n-1])
			return 1+LCS(charArr1,charArr2,m-1,n-1);
		else
		{
			return Math.max(LCS(charArr1,charArr2,m,n-1), LCS(charArr1,charArr2,m-1,n));
		}
	}
	
}
