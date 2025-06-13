package ch12;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarExample {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		

		System.out.println(TimeZone.getDefault().getID()+":");
		//getID() : r각 나라별 
		
		System.out.println(cal.get(Calendar.YEAR)+"년");
		System.out.println(cal.get(Calendar.MONTH)+1 +"월"); //월은 +!처리 필수
		System.out.println(cal.get(Calendar.DATE)+"일");
		System.out.println(cal.get(Calendar.AM_PM)==0 ? "오전" :"오후");
		System.out.println(cal.get(Calendar.HOUR)+"시");
		System.out.println(cal.get(Calendar.MINUTE)+"분");
		System.out.println(cal.get(Calendar.SECOND)+"초");
		
		
		System.out.println(cal.getTimeInMillis());
		System.out.println("=====================================");
		TimeZone timeZone = TimeZone.getTimeZone("Chile/Continental");
		cal = Calendar.getInstance(timeZone);
		System.out.print(timeZone.getID()+"=>");
		System.out.println(cal.get(Calendar.YEAR)+"년");
		System.out.println(cal.get(Calendar.MONTH)+1 +"월"); //월은 +!처리 필수
		System.out.println(cal.get(Calendar.DATE)+"일");
		System.out.println(cal.get(Calendar.AM_PM)==0 ? "오전" :"오후");
		System.out.println(cal.get(Calendar.HOUR)+"시");
		System.out.println(cal.get(Calendar.MINUTE)+"분");
		System.out.println(cal.get(Calendar.SECOND)+"초");
		
		System.out.println(cal.getTimeInMillis());
	}
}