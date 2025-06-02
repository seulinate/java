package ch06;

//객체 
//속성 -> 변수
//행위(동작) -> 메서드
public class Account {
	
	//속성 - 변수 - 명사적 특징
	public String name;
	public String accountNumber; //계좌번호
	public String passwd;
	public long balance; //이율
	public float interest; //잔액
	
	//행위 - 동작- 메서드 - 기능
	public void saveMoney(long amount) { //예금
		balance = balance + amount;
	}
	
	public void withdrawMoney(long amount) { //출금
		balance = balance - amount;
	}
	
	public long getBalance() {
		return balance;
	}
}