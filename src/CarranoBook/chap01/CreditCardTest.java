package CarranoBook.chap01;

public class CreditCardTest {

		public static void main(String[] args){
			CreditCard wallet[] = new CreditCard[10];
			wallet[0] = new CreditCard("5391", "John", "Bof", 0.0, 2500);
			wallet[1] = new CreditCard("5391", "ABe", "Bof", 0.0, 2500);
			wallet[2] = new CreditCard("5391", "Lal", "Bof", 0.0, 2500);
		
		
		for (int i=1;i<=16;i++){
			wallet[0].chargeIt((double)i);
			wallet[1].chargeIt(2.0*i);
			wallet[2].chargeIt((double)3*i);
			
		}
		
		for(int i=0; i<3;i++){
			CreditCard.printCard(wallet[i]);
			while(wallet[i].getBalance()>100.0){
				wallet[i].makePayment(100.0);
				System.out.println("New Balance="+wallet[i].getBalance());
			}
		}
		
		}
	
}
