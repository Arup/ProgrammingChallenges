package basic;

import basics.Account;

public class AccountTester {

    public static void main (String [ ] args) {
        Account mike,bill;
        mike = new Account (500);
        bill = new Account (100,mike);
        System.out.println (mike.balance ());
        System.out.println(bill.balance ());
        bill.withdraw (200);
        System.out.println (mike.balance ());
        System.out.println(bill.balance ());
        
    }
}