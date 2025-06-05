package ch07.encapsulation;

public class GoodcaseMyDate {
//	public int day;
//	public int month;
//	public int year;

	
	//private으로 멤버변수 선언했음 이 경우 해당 클래스가 아닌곳에서는 사용이 제한된다. 
	private int day;
	private int month;
	private int year;
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int d) {
		if((d<1) || (d>31)) {
			throw new RuntimeException("잘못된 날짜를 입력하셨습니다.");
		}else {
			day = d;
		}
	}
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String toString() {
		return this.year + "_" + this.month + "_" + this.day;
	}
}
