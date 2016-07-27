import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CircularArrayRotation {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k=  in.nextInt();
        int q=  in.nextInt();
        
        int[] arr=new int[n];
        int [] indexArr=new int[q];
        
        for(int count=0;count<n;count++){
        	arr[count]=in.nextInt();
        }

        for(int count=0;count<q;count++){
        	indexArr[count]=in.nextInt();
        }
        
        arr=shiftKTimes(arr,k);
        
        for(int count=0;count<q;count++){
        	System.out.println(arr[indexArr[count]]);
        }
        
        
    }
    
    static int [] shiftKTimes(int arr[],int k){
    	int temp=0;
//    	int loc=0;
//    	for(int count=0;count<arr.length;count++){
//    		loc=count+k;
//    		if(loc>arr.length-1)
//    			loc=loc-(arr.length-1);
//    		temp=arr[count];
//    		arr[count]=arr[loc];
//    		arr[loc]=temp;  		
//    	}
    	for(int count=0;count<k;count++){
    		arr=shift(arr);
    	}
    	return arr;
    }
    
    static int [] shift(int arr[]){
    	int lastElement=arr[(arr.length-1)];
    	
    	for (int count=(arr.length-1);count>0;count--){
    		arr[count]=arr[count-1];
    	}
    	
    	if(arr.length>=1)
    	arr[0]=lastElement;
    	
    	return arr;
    }
    
//    void swap(int a, int b){
//    	a
//    }
}