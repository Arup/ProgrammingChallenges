package CarranoBook.chap01;

import java.util.Date;

public class CreditCard {
public String number;
public CreditCard(String number, String name, String bank, double balance,
		int limit) {
	super();
	this.number = number;
	this.name = name;
	this.bank = bank;
	this.balance = balance;
	this.limit = limit;
}
public String name;
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBank() {
	return bank;
}
public void setBank(String bank) {
	this.bank = bank;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public int getLimit() {
	return limit;
}
public void setLimit(int limit) {
	this.limit = limit;
}
public String bank;
public double balance;
public int limit;
public double interestOnPayment;
public Date dueDate;

public boolean chargeIt(double price){
	if (price + balance > (double)limit)
		return false;
	balance +=price;
		return true;
}

public void makePayment(double payment){
	balance-=payment*(1+interestOnPayment);
}

public static void printCard(CreditCard c){
	System.out.println("Number= "+ c.getNumber());
	System.out.println("Name= "+ c.getName());
	System.out.println("Bank= "+ c.getBank());
	System.out.println("Balance= "+ c.getBalance());
	System.out.println("Limit= "+ c.getLimit());
	
}


}


