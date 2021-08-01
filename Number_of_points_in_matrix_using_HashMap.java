package com.main.leetcode;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Number_of_points_in_matrix_using_HashMap {
	  static int subscore=0;
	static long score=0;
	 static List<Integer> ycoordinates= new ArrayList<Integer>();
	 public static long maxPoints(int no_of_rows, int[][] arr) {
	        int i = 0;
	        int max = 0, maxscore=0;
	        int iindex=0, yindex=0;
	   //     HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	        // Initialize max to 0 at beginning
	        // of finding max element of each row
	        List<Integer> coordinates= new ArrayList<Integer>();
	       
	        int[] result = new int[no_of_rows];
	        while (i < no_of_rows) {
	       
	            for (int j = 0; j < arr[i].length; j++) {
	                if (arr[i][j] > max) {
	                    max = arr[i][j];
	                    iindex=i;
	                    yindex=j;
	                }
	                
	            }
	            maxscore=maxscore+max;
	            System.out.println(iindex+" "+yindex+" "+arr[iindex][yindex]);
	            coordinates.add(iindex);
	            coordinates.add(yindex);
	            i++;
	            max=0;
	        }
	        ycoordinates=getYCoordinates(coordinates);
	        for( i=0;i<ycoordinates.size()-1;i++)
	        {
	        	subscore=subscore+(ycoordinates.get(i)-ycoordinates.get(i+1));
	        }
	        System.out.println("Sub score "+subscore+" MaxScore "+maxscore);
	        score=maxscore-subscore;
	        return score;
	 }
	    // Print array element
	    private static void printArray(int[] result) {
	        for (int i =0; i<result.length;i++) {
	            System.out.println(result[i]);
	        }
	    }
	  public static void main(String[] args)
	  {
		 
    	int[][] matrix=  {{0,3,0,4,2},{5,4,2,4,1},{5,0,0,5,1},{2,0,1,0,3}};
		score=	maxPoints(matrix.length,matrix);
		System.out.println(score);
	  }

	  public static   List<Integer> getYCoordinates(List<Integer> coordinates)
	  {
		  int i=0;
		  Iterator itr= coordinates.iterator();
		  while(itr.hasNext())
		  {
			  int coordinate=(int) itr.next();
			  if(i%2!=0)
			  {  
				  ycoordinates.add(coordinate);
			  }
			  i++;
		  }
		  
		 System.out.println("Y coordinates "+ycoordinates);
		  return ycoordinates;
	  }
}
