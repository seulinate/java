package ch07.final_;

public class FinalRefVarExample {
	
	static final MyDate date = new MyDate();

	public static void main(String[] args) {
		date.year = 2024; //아무리 final 변수라고해도 
		System.out.println(date.toString());
	}
}

class MyDate {
	int year = 2025; //멤버변수의 값은 변경이 가능하다. (단, 참조변수의 값은 변경이 불가능하다. ) 
	int month = 6;
	int day = 1;
	
	public String toString() {
		return "[" + year + "-" + month + "-" + day +"]";
	}
}