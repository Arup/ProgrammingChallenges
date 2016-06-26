package CarranoBook.chap01;
import java.lang.Math;

public class R1Dot9IsOdd {

boolean isOdd=false;

int repeatSub (int num){
	
	while(num>=10){
		num=num-10; 
	}
	return num;
}

boolean isOdd(int num){
	
//	int oddCount=0;
//	int evenCount=1;
//	
//	while(isOdd!=true && num>=0){
//		evenCount++;
//		isOdd=true;
//		num--;
//	}
//	
//	while(isOdd && num>=0){
//		oddCount++;
//		isOdd=false;
//		num--;
//	}
//	
//	System.out.println(oddCount);
//	System.out.println(evenCount);
//	
//	if(oddCount>=evenCount)
//	return true;
//	else
//	return false;
	
	num=repeatSub(num);
	
	switch (num){
	case 1:
		return true;
	case 3:
		return true;
	case 5:
		return true;
	case 7:
		return true;
	case 9:
		return true;
	default:
		return false;
	}
	
}

public static void main(String args[]){
	System.out.println("The value of 12 is");
	R1Dot9IsOdd r=new R1Dot9IsOdd();
	if(r.isOdd(12)){
		System.out.println("Odd");
	}else{
		System.out.println("Even");
	}
}
}
