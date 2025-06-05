package ch07.encapsulation;

public class BadcaseTestMyDate {

	public static void main(String[] args) {
		BadcaseMyDate mydate = new BadcaseMyDate();
		
		mydate.year = 1998;
		mydate.month = 7;
		mydate.day = 75;
		System.out.println("My Birthday :" + mydate.toString());
	}

}
