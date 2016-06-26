package basics;

import java.util.Scanner;

public class Sum1toN {
	/*
	Write a program that asks the user for a number n and prints the sum of the numbers 1 to n
	*/
	
	int sum1toN(int n){
		int sum=0;
		for(int i=0;i<=n;i++){
			sum+=i;
		}
		return sum;
	}
	
	int multiply(int a,int b){
		return a*b;
	}
	
	boolean isEven(int a){
		return (a%2==0);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num1=0,num2=0;
		// TODO Auto-generated method stub
		try {
			Scanner sc=new Scanner(System.in);
			 num1=sc.nextInt();
			 num2=sc.nextInt();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Sum1toN s=new Sum1toN();
		System.out.println("Product of"+num1 +"and "+num2 +"is :"+s.multiply(num1,num2));
		
	}

}
