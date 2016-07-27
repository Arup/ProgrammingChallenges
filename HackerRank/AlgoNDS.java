
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AlgoNDS {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        double[] fractions=findPercentageNumbers(arr);
        
        System.out.println(fractions[0]);
        System.out.println(fractions[1]);
        System.out.println(fractions[2]);
    }
    
     static double [] findPercentageNumbers(int arr[]){
    	
    	double fraction []=new double[3];
    	double total =0;
        for(int arr_i=0; arr_i < arr.length; arr_i++){
           	if(arr[arr_i]>0){
           		fraction[0]=fraction[0]+1;
           	}else if(arr[arr_i]==0){
           		fraction[1]=fraction[1]+1;
           	}else{
           		fraction[2]=fraction[2]+1;
           	}
        }
    	
        total = fraction[0]+fraction[1]+fraction[2];
        
        fraction[0]=fraction[0]/total;
        fraction[1]=fraction[1]/total;        
        fraction[2]=fraction[2]/total;
        
		return fraction;
    	
    }
}

	
	

