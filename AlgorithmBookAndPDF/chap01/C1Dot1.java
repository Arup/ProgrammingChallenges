package chap01;

public class C1Dot1 {
	
	//
	//Write a short Java function that takes an array of int values and determines
	//if there is a pair of numbers in the array whose product is odd.
	
	boolean isOdd(int num){
		if(num%2!=0)
			return true;
		else
			return false;
	}
	
	int findOddPair(int num[]){
		int []resultArray;
		int length=num.length;
		resultArray=new int[length];
		int[] retArray = new int[length];
		
		if(length<=2){
			if(length==1 || length==0){
				return 0;
			}else{
				if(isOdd(num[0]*num[1])){
				 return 1;
				}else{
				return 0;
				}
			}
		}
		else{
		for (int i=0;i<length;i++){
			for(int j=1;j<(length-1);j++){
				if(isOdd(num[i]*num[j])){
					resultArray[i]=num[i];
					resultArray[j]=num[j];
				}
			}
		}
		}
		//remove 0's from resultArray
		
		int count=0;
		int k=0;
		while(count<(length)){
			if(resultArray[(count)]!=0){
				retArray[k]=resultArray[count];
				k++;
		}
			count++;
		}
		
		count=0;
		k=0;
		while(retArray[(k)]!=0 && (k<resultArray.length-1)){
			k++;
		}
		
		resultArray=new int[k];
		
		while(count<(k)){
			resultArray[count]=retArray[count];
			count++;
		}
		
		return resultArray.length;
	
	}
	
	boolean findOddP(int p[]){
		int count=0;
		
		for(int i=0;i<p.length;i++){
			if(isOdd(p[i])){
				count++;
			}
		}
		if(count>=2)
			return true;
		else
			return false;
	
	}
	
	public static void main(String args[]){
		
		int[] input={1,3};
		
		C1Dot1 c=new C1Dot1();
		
//		for(int k=0;k<c.findOddPair(input).length;k++){
//			System.out.println(c.findOddPair(input)[k]);
//		}
		
		
//		if(c.findOddPair(input)>0){
//			System.out.println("There is at least one pair of odd products");
//		}else{
//			System.out.println("no odds");
//		}
		
		if(c.findOddP(input)){
			System.out.println("There is at least one pair of odd products");
		}else{
			System.out.println("no odds");
		}
		
	}

}
