package com.main.leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Number_of_points_matrix {
public static void main(String[] args)
{
	List<Point> list = new ArrayList<Point>();
	 int[][] points=generateMatrix();
	list.add(new Point(0,2));
	list.add(new Point(1,1));
	list.add(new Point(2,0));
	int score=findMaxScore(list, points);
	System.out.println("Score "+score);
}
public static int findMaxScore(List<Point> list, int[][] points)
{
	Iterator itr =list.iterator();
	int subscore=0, totalscore=0;
	for(int i=0;i<list.size()-1;i++)
	{
		Point p1=list.get(i);
		Point p2=list.get(i+1);

		subscore=subscore+Math.abs(p2.y-p1.y);
		
		
	}
	System.out.println("Subscore "+subscore);
	for(int i=0;i<list.size();i++)
	{
		Point p=list.get(i);
		System.out.println(p.x+" "+p.y);
		totalscore=totalscore+points[p.x][p.y];
	}	
	return totalscore-subscore;
}
public static int[][] generateMatrix()
{
	int[][] matrix= {{1,2,3},{1,5,1},{3,1,1}};
	return matrix;
}
}
class Point
{
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	int x;
	int y;
}