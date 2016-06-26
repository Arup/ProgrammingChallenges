package HackerRank;
import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;


public class JavaLoops {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner sc=new Scanner(System.in);
        int temp = sc.nextInt();
        int a, b,c, sum;

        for (int i = 0; i < temp;i++)
            {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            for(int k=0;k<c;k++){
            sum = formulaResult(a,b,c);
            System.out.println(sum);
            }
            }
    	
    }
	
	static int formulaResult(int a,int b,int n){
		int result=0;
		
		result=a+b*(sumTwoPow(n));		
		
		return result;
		
	}

	private static int sumTwoPow(int n) {
		// TODO Auto-generated method stub
		if(n==0){
			return 1;
		}else{
		return 2*sumTwoPow(n-1);
		}
		
		
	}
	
	

}
