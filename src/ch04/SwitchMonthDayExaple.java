package ch04;

import java.util.Scanner;

public class SwitchMonthDayExaple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("연도와 월을 입력하세요(예시: 2025 5)  > ");
		int year = sc.nextInt();
		int month = sc.nextInt();
		int daysNum = 0;
		
		switch (month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10: case 12:
			daysNum = 31;
			break;
			
		case 4: case 6: case 9: case 11: 
			daysNum = 30;
			break;
			
		case 2: 
			//윤년 : 4년에 한번있는거 
			if((year % 4 == 0) && !(year % 100 == 0) || (year % 400 == 0)) {
				daysNum = 29;
			}else {
				daysNum = 28;
			}
			break;
		default : 
			System.out.println("잘못 입력했습니다.");
			break;
		}
		System.out.printf("입력한 연도의 달은 총 %d일 입니다.",daysNum);
		sc.close();
	}

}
