import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DivisibleByK {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        int diff[]=new int[n];
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>(n);
        
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
//        diff=diffArray(a, k);
//        
//        for(int i=0;i<n;i++){
//        	if(!map.containsKey(diff[i])){
//        		map.put(diff[i],freq(a,diff[i]));
//        	}
//        }
        
        for(Integer i:map.keySet()){
        		sum=sum+(Integer) map.get(i);
        }
        sum=0;
        //System.out.println("Sum is"+sum);
        
        ArrayList list=createComboSum(a);
       // System.out.println("size of c"+list.size());
        for(int c=0; c<list.size();c++){
        	System.out.println(list.get(c));
        	if(c%k==0){
        		sum=sum+1;
        	}
        	
        }
        //System.out.println(sum);
    }
    
//    static int[] diffArray(int a[],int k){
//    	int diff[]=new int[a.length];
//    	for(int count=0;count<a.length;count++){
//    		diff[count]=Math.abs(k-a[count]);
//    		System.out.println(diff[count]);
//    	}
//    	
//    	return diff;
//    	}
    
    
//    static int freq(int[] a,int num){
//    	int count=0;
//    	for(int i=0;i<a.length;i++){
//    		if(num==a[i]){
//    			count=count+1;
//    		}
//    	}
//    	return count;
//    }
    
    static ArrayList createComboSum(int a[]){
    	ArrayList arr=new ArrayList();
    	
    	for(int i=0;i<a.length;i++){
    		for(int j=1;j<(a.length-i);j++){
    			arr.add(a[i]+a[j]);
    			
    		}
    	}
		return arr;
    }
}
