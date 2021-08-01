package com.main.leetcode;

public class ClimbStairs_withAnNumber {

	public static int ways(int n)
{
		int i=0;
		int[] res= new int[n+1];
		
		res[0]=1;
		res[1]=1;
		for( i=2;i<=n;i++)
		{
			res[i]=res[i-1]+res[i-2];
		
		}
		
return res[n];		
}
public static void main(String[] args)
{
int n=3;
System.out.println("Ways "+ways(n));	
}
}
