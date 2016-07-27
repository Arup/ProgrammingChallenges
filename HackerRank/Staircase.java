import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Value of n is"+n);
        
        for (int count=0;count<n;count++){
        	for(int i=n-1;i>count;i--){
        		System.out.print(" ");
        	}
        	for(int j=0;j<=count;j++){
        		System.out.print("#");
        	}
        	System.out.println();
        }
    }
}