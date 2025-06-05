package ch06;

public class AccountMain {

	public static void main(String[] args) {
		Account myAccount = new Account(); //객체 만들었음
		
		// name,passwd,balance => Account클래스에 만들었던 변수들 -> 멤버변수
		//멤버변수 사용할때는 점으로 구분해서 생성 객체.멤버변수 = "값할당하기";
		myAccount.name = "홍길동";
		myAccount.accountNumber = "002-1122-12345";
		myAccount.passwd = "1234";
		myAccount.balance = 380000;
		myAccount.interest = 6.03F;
		
		//Account 클래스에서 만들었던 메서드들 -> 멤버메서드
		myAccount.saveMoney(5000);
		myAccount.withdrawMoney(80000);
		long myBalance = myAccount.getBalance();
		System.out.println(myBalance);
	}
}