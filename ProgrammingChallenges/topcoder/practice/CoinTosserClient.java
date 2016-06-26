package practice;

public class CoinTosserClient {
public static void main(String args[]){


	
	int headCount=0,tailCOunt=0;
	
	GenericCoin GC=new GenericCoin();
	
	for(int i=0;i<50;i++){
		GC.toss();
		if(GC.isHeadSide())
			headCount++;
		else
			tailCOunt++;
			
	}
	
	System.out.println("HeadCount is: "+headCount);
	System.out.println("TailCount is: "+tailCOunt);
	
}
}
