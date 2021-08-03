package com.main;

import java.lang.Math;

public class checkForTriplets {
public static void main(String[] args)
{
	int[] a= {-1,2,1,-4};
	int target=1,sum=0, currsum=Integer.MAX_VALUE;
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			for(int k=j+1;k<a.length;k++)
			{
				sum=a[i]+a[j]+a[k];
				if(Math.abs(currsum-target)>Math.abs(currsum-sum))
				{
					currsum=sum;
				}
				
			}
		}
	}
	System.out.println(currsum);
}
}
