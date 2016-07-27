
	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

public class DivisibleK {
	




	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int k = in.nextInt();
	        int a[] = new int[n];
	        //int diff[]=new int[n];
	        int sum=0;
	       // HashMap<Integer,Integer> map=new HashMap<Integer,Integer>(n);
	        
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	            //System.out.println(a[a_i]);
	        }
	        ArrayList list=createComboSum(a);
	        
	        for(int c=0; c<list.size();c++){
	        	//System.out.println(list.get(c));
	        	if((Integer)list.get(c) %k==0){
	        		sum=sum+1;
	        	}
	        	
	        }
	        System.out.println(sum);
	    }
	    
	    static ArrayList createComboSum(int a[]){
	    	ArrayList arr=new ArrayList();
	    	
	    	for(int i=0;i<a.length-1;i++){
	    		for(int j=i+1;j<(a.length);j++){
	    			arr.add(a[i]+a[j]);
	    		}
	    	}
			return arr;
	    }

	}

