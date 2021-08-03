package com.main.leetcode;
import java.util.Scanner;
public class ClimbingStairs_withAnArray {
public static void main(String[] args)
{
	/**
	 * Question -> You are required to print number of different paths via which can climb to the top 
	 */
	Scanner sc= new Scanner(System.in);
	int[] jumpsAllowed= {3,3,0,2,2,3}; //jumps allowed in different position
	int[] dp = new int[jumpsAllowed.length+1];
	
	dp[jumpsAllowed.length]=1; //Since last jump will be always 1
	//Here we need to start from behind 
	for(int i=jumpsAllowed.length-1;i>=0;i--)
	{
		for(int j=1;j<=jumpsAllowed[i] && i+j < dp.length;j++)
		{
		dp[i]+=dp[i+j];
		}
	}
	System.out.println(dp[0]);
}
	
}
