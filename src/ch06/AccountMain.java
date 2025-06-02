package ch06;

public class AccountMain {

	public static void main(String[] args) {
		Account myAccount = new Account(); //객체 만들었음
		
		myAccount.name = "홍길동";
		myAccount.accountNumber = "002-1122-12345";
		myAccount.passwd = "1234";
		myAccount.balance = 380000;
		myAccount.interest = 6.03F;
		
		myAccount.saveMoney(5000);
		myAccount.withdrawMoney(80000);
		long myBalance = myAccount.getBalance();
		System.out.println(myBalance);
	}
}