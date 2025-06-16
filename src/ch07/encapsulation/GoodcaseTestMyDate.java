package ch07.encapsulation;

public class GoodcaseTestMyDate {
	public static void main(String[] args) {
		GoodcaseMyDate mydate = new GoodcaseMyDate();
		
//		mydate.year = 1998;
//		mydate.month = 7;
//		mydate.day = 75;
		
		//값 변경은 set , 값 읽는건 get
		mydate.setYear(1998);
		mydate.setMonth(7);
		mydate.setDay(15);

		System.out.println("My Birthday :" + mydate.toString());
	}
}
