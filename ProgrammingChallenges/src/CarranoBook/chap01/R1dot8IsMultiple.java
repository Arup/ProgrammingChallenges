package CarranoBook.chap01;

public class R1dot8IsMultiple {
	boolean value=false;
	double result;
	
	boolean isMultiple(long n, long m){
		try {
			result=n/m;
			Integer.parseInt(new String(""+result));
		} catch (Exception e) {
			return false;
		}
			return true;
	}
	
	public static void main(String args[]){
		R1dot8IsMultiple r = new R1dot8IsMultiple();
		System.out.println("Is these multiples of each"+r.isMultiple(200, 100));
		
	}
	
}
