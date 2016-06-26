package practice;

import java.util.LinkedList;
import java.util.Scanner;

public class ThousandFirstPrime {
	 static boolean testPrime(int n){
		
		boolean isPrime=true;
		int limit;
		limit=(int) (Math.sqrt(n)+1);
		
		for(int count=2;count<limit;count++){
			if(n%count==0){
				isPrime=false;
				break;
			}
		}
		
		
		return isPrime;
		
	}
	
	public static void main(String args[]){
//		System.out.println("Input a number to test if its prime");
//		Scanner sc=new Scanner(System.in);
//		
//		int testPrime=sc.nextInt();
//		
//		ThousandFirstPrime tps=new ThousandFirstPrime();
		
//		if(tps.testPrime(testPrime)){	
//		System.out.println("It is a Prime ");
//		}else{
//			System.out.println("It is not a prime");
//		}
		
		System.out.println("The sixth prime number:"+generatePrime());
		
	}

	
	public static int generatePrime(){
		int incrementCount=1;
		int primeCount=0;
		LinkedList list;
		Integer primenumber=null;
		
		list=new LinkedList();
		
		while(primeCount!=10002){
			if(testPrime(incrementCount)){
				list.add(incrementCount);
				primeCount++;
				}
			incrementCount++;			
		}
		
		primenumber=(Integer) list.peekLast();
		
		return primenumber.intValue();
		
	}
}
