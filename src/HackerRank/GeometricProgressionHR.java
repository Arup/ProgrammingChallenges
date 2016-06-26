package HackerRank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GeometricProgressionHR {
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	/*
			2
			0 2 10
			5 3 5
    	 */
    	
    	ArrayList<LinkedList<Integer>> arrList;
    	LinkedList<Integer> list;
    	
    	Scanner sc=new Scanner(System.in);
    	arrList=new ArrayList<LinkedList<Integer>>();
    	int x=sc.nextInt();
    	
    	for(int i=0;i<x;i++){
    		int a=sc.nextInt();
    		int b=sc.nextInt();
    		int n=sc.nextInt();
    		
    		list=new LinkedList<Integer>();
    		
    		for(int j=0;j<n;j++){
    			int next_term=0;
    			if(j==0)
    				next_term= (int) (a+b*(Math.pow(2,j)));
    			else
    				next_term= list.get(j-1)+(int) (b*(Math.pow(2,j)));
    		list.add(new Integer(next_term));
    		}    		
    		
    		arrList.add(list);
    	}
    	
    	
    	for (int m=0;m<arrList.size();m++){
    		list=arrList.get(m);
    		   Object[] array = list.toArray();

    		   // print the array
    		   for (int i = 0; i < list.size(); i++) {
    		   System.out.print(array[i]+" ");
    		   }
    		   System.out.println("\n");
    		
    	}
    	
    }

}
