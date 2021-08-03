package com.main.leetcode;
import java.lang.Math;
public class Container_With_Most_Water {
 public static void main(String[] args)
 {
	 int[] a= {1,8,6,2,5,4,8,3,7}; 
	 int left =0,right=a.length-1,water=0,currwater=0;
	 while(left < right)
	 {
		 currwater=Math.min(a[left],a[right])*(right-left);
		 water=Math.max(water,currwater );
		 if(a[left]> a[right])right--;
		 else left++;
	 }
	 System.out.println("Water "+water);
 }
}
